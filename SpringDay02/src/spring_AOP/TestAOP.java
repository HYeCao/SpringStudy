package spring_AOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {


 
	  @Test
	  public void demo01(){
			String xmlPath = "spring_AOP/Beans.xml";
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
			
			//获得目标类
			UserService userService = (UserService) applicationContext.getBean("userServiceId");
			userService.addUser();
			userService.updateUser();
			userService.deleteUser();
		}

  
}
