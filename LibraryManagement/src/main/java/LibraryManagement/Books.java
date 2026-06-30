package LibraryManagement;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Books {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student seq")
@SequenceGenerator(name = "student seq",sequenceName = "StudentId",initialValue = 121014,allocationSize = 1)
private int StudentId;
private String StudentName;
private String BookName;
private String AuthorName;
private int Quantity;
private boolean Availability;
public boolean isAvailability() {
	return Availability;
}
public void setAvailability(boolean availability) {
	Availability = availability;
}
private LocalDateTime IssueTime;
private LocalDateTime ReturnTime;

public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getAuthorName() {
	return AuthorName;
}
public void setAuthorName(String authorName) {
	AuthorName = authorName;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public LocalDateTime getIssueTime() {
	return IssueTime;
}
public void setIssueTime(LocalDateTime issueTime) {
	IssueTime = issueTime;
}
public LocalDateTime getReturnTime() {
	return ReturnTime;
}
public void setReturnTime(LocalDateTime returnTime) {
	ReturnTime = returnTime;
}

	
}


