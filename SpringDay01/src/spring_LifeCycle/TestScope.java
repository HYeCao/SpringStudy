package spring_LifeCycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

	@Test
	public void demo02() {
		// spring 工厂
		String xmlPath = "spring_LifeCycle/Beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();

		// 要求：1.容器必须close，销毁方法执行; 2.必须是单例的
		// applicationContext.getClass().getMethod("close").invoke(applicationContext);
		// * 此方法接口中没有定义，实现类提供s
		applicationContext.close();

	}
}
