package task.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("task.employee")
public class EmpDao {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpDao.class);
		Employee e1 = (Employee) context.getBean("emp");
		e1.display();
	}

}
