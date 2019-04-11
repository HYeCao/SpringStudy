package spring_static_Factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

	@Test
	  public void demo01(){
		  // ��̬��������
		UserService userService =MyBeanFactory.createService();
		userService.addUser();
		
	  }
  @Test
  public void demo02(){
	  //spring ���� �˴������汾���⣺
	  //            jdk 1.7 ��Ӧspring 3.2
	    //          jdk 1.8��Ӧspring 4.0
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_static_Factory/Beans.xml");
	     UserService service= context.getBean("userServiceId",UserService.class);
	     service.addUser();
  }
  
}
