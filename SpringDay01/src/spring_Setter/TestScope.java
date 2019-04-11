package spring_Setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	@Test
	public void demo02() {
		// spring ¹¤³§
		String xmlPath = "spring_Setter/Beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		Person person = (Person) applicationContext.getBean("personId");
		System.out.println(person);

	}
}
