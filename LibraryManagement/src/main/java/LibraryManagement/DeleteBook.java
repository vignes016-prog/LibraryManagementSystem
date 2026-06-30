package LibraryManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteBook {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Books book=entityManager.find(Books.class, 121018);
	if(book!=null)
	{
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
	}
	else {
		System.out.println("Book not found!");
	}
}
}
