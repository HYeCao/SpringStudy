package spring_FactoryBean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringJDK {


 
	  @Test
		public void demo01(){
			String xmlPath = "spring_FactoryBean/Beans.xml";
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
			
			//获得代理类
			UserService userService = (UserService) applicationContext.getBean("proxyServiceId");
			userService.addUser();
			userService.updateUser();
			userService.deleteUser();
		}

  
}
