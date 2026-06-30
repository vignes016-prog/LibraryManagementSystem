package LibraryManagement;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class FecthAllDetails{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select b from Books b");
		List<Books>list=query.getResultList();
		for(Books ele:list)
		{
			System.out.println("AUTHOR NAME: "+ele.getAuthorName());
			System.out.println("BOOK NAME: "+ele.getBookName());
			System.out.println("STUDENT ID: "+ele.getStudentId());
			System.out.println("STUDENT NAME: "+ele.getStudentName());
			System.out.println("BOOK QUANTITY: "+ele.getQuantity());
			System.out.println("BOOK TAKING TIME : "+ele.getIssueTime());
			System.out.println("BOOK RETURN TIME: "+ele.getReturnTime());
			System.out.println("==============================================");
		}
	}
}