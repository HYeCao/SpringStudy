package spring_Scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

  @Test
  public void demo02(){
	  //spring 工厂  将实例化过程在文件配置中实现
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_Scope/Beans.xml");
	     UserService service=(UserService) context.getBean("userServiceId"); 
	     UserService service2=(UserService) context.getBean("userServiceId"); 
	     /*
	      * 生成了两个不同的对象
	      */
	     System.out.println(service);
	     System.out.println(service2);
  }
}
