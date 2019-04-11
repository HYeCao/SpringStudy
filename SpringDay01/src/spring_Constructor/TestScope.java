package spring_Constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * 构造方法的注入
 */
public class TestScope {

	@Test
	public void demo02() {
		// spring 工厂
		String xmlPath = "spring_Constructor/Beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		User user = (User) applicationContext.getBean("userId");
		System.out.println(user);

	}
}
