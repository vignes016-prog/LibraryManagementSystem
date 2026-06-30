package LibraryManagement;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TakeBook {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Books book=new Books();
    book.setStudentName("Hasir");
    book.setBookName("Think and Grow Rich");
    book.setAuthorName("Nepholean Hill");
    book.setQuantity(1);
    book.setAvailability(true);
    book.setIssueTime(LocalDateTime.now());
    book.setReturnTime(LocalDateTime.now().plusDays(7));
   
    Books book2=new Books();
    book2.setStudentName("Rocky");
    book2.setBookName("Rich Dad Poor Dad");
    book2.setAuthorName("Robert T.Kiyosaki");
    book2.setQuantity(2);
    book2.setAvailability(true);
    book2.setIssueTime(LocalDateTime.now());
    book2.setReturnTime(LocalDateTime.now().plusDays(7));
 
    Books book3=new Books();
    book3.setStudentName("michel");
    book3.setBookName("Who Moved My Cheese?");
    book3.setAuthorName("Spencer Jhonson");
    book3.setQuantity(1);
    book3.setAvailability(true);
    book3.setIssueTime(LocalDateTime.now());
    book3.setReturnTime(LocalDateTime.now().plusDays(7));
    
    List<Books>list=new ArrayList<Books>();
    list.add(book);
    list.add(book2);
    list.add(book3);
    
    
    entityTransaction.begin();
    for(Books ele:list)
    {
    	entityManager.persist(ele);	
    }
    
   
    entityTransaction.commit();
}
}
