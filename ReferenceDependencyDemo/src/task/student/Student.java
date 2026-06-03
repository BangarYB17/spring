package task.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	   @Value("Yogeshwar")
       private String studentName;
       @Autowired
       private Course course;
       
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
       
    public void display() {
    	System.out.println("Student: "+studentName);
    	System.out.println(course);
    }
       
}
