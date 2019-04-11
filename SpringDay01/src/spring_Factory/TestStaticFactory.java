package spring_Factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
  @Test
  public void demo01(){
	  //�Զ���ʵ������
	 //1.��������
	  MyBeanFactory factory=new MyBeanFactory();
	  //2.ͨ������ʵ������ö���
	  UserService userService=factory.createService();
	  userService.addUser();
  }
  @Test
  public void demo02(){
	  //spring ����  ��ʵ�����������ļ�������ʵ��
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring_Factory/Beans.xml");
	     UserService service=(UserService) context.getBean("userServiceId"); 
	     service.addUser();
  }
}
