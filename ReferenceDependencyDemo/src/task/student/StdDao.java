package task.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("task.student")
public class StdDao {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StdDao.class);
		Student s1 = (Student) context.getBean("student");
		s1.display();

	}

}
