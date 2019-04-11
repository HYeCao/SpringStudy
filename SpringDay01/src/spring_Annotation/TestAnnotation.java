package spring_Annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * ����ע�⣬�����ļ�����
 * @author dell
 *
 */
public class TestAnnotation {

	@Test
	public void demo02() {
		// spring ����
		String xmlPath = "spring_Annotation/Beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();

	}
}
