package spring_Scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

  @Test
  public void demo02(){
	  //spring ����  ��ʵ�����������ļ�������ʵ��
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_Scope/Beans.xml");
	     UserService service=(UserService) context.getBean("userServiceId"); 
	     UserService service2=(UserService) context.getBean("userServiceId"); 
	     /*
	      * ������������ͬ�Ķ���
	      */
	     System.out.println(service);
	     System.out.println(service2);
  }
}
