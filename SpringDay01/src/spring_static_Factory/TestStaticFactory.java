package spring_static_Factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {

	@Test
	  public void demo01(){
		  // 静态工厂方法
		UserService userService =MyBeanFactory.createService();
		userService.addUser();
		
	  }
  @Test
  public void demo02(){
	  //spring 工厂 此处产生版本问题：
	  //            jdk 1.7 对应spring 3.2
	    //          jdk 1.8对应spring 4.0
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_static_Factory/Beans.xml");
	     UserService service= context.getBean("userServiceId",UserService.class);
	     service.addUser();
  }
  
}
