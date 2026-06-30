package LibraryManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBook {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Books book=entityManager.find(Books.class, 121014);
	if(book!=null)
	{
		book.setAvailability(false);
	}
	entityTransaction.begin();
	entityManager.merge(book);
	entityTransaction.commit();
}
}
