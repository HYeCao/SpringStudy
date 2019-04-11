package spring_Factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
  @Test
  public void demo01(){
	  //自定义实例工厂
	 //1.创建工厂
	  MyBeanFactory factory=new MyBeanFactory();
	  //2.通过工厂实例，获得对象
	  UserService userService=factory.createService();
	  userService.addUser();
  }
  @Test
  public void demo02(){
	  //spring 工厂  将实例化过程在文件配置中实现
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_Factory/Beans.xml");
	     UserService service=(UserService) context.getBean("userServiceId"); 
	     service.addUser();
  }
}
