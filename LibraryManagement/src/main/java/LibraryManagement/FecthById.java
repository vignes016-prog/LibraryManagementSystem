package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FecthById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Books book=entityManager.find(Books.class, 121020);
		
		if(book !=null)
		{
			System.out.println("Book name is:"+book.getBookName());
		System.out.println("Author name:"+book.getAuthorName());
		System.out.println("Student Id:"+book.getStudentId());
		System.out.println("Student Name:"+book.getStudentName());
		System.out.println("Book taken date: "+book.getIssueTime());
	}
		else {
			System.out.println("book not found");
		}

}
}
