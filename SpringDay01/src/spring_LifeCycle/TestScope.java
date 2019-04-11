package spring_LifeCycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	@Test
	public void demo02() {
		// spring ����
		String xmlPath = "spring_LifeCycle/Beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();

		// Ҫ��1.��������close�����ٷ���ִ��; 2.�����ǵ�����
		// applicationContext.getClass().getMethod("close").invoke(applicationContext);
		// * �˷����ӿ���û�ж��壬ʵ�����ṩs
		applicationContext.close();

	}
}
