package LibraryManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import javax.persistence.Query;

public class ShowAvailability {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Query query=entityManager.createQuery("select b from Books b where b.Availability=true");
	List<Books>list=query.getResultList();
	for(Books ele:list)
	{
		System.out.println("Book name : "+ele.getBookName());
		System.out.println("Author name : "+ele.getAuthorName());
	    System.out.println("===================================");
	}
entityManager.close();
entityManagerFactory.close();
}

}
