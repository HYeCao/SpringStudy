package spring_IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoC {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring_IoC/Beans.xml");
	     BookDaoImpl book=(BookDaoImpl) context.getBean("bookDaoId"); 
	     book.addBook();
	     book.getMessage();
	}
}
