package spring_DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDI {
    @Test
    public void demo1(){
    	 ApplicationContext context = new ClassPathXmlApplicationContext("spring_DI/Beans.xml");//xml�ļ����������
	     BookService bookService=(BookService) context.getBean("bookServiceId"); //
	     
	     bookService.addBook();
    }
}
