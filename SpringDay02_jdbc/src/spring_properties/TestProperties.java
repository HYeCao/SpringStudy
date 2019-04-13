package spring_properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestProperties {

	@Test
	public void demo01() {
		User user=new User();
		user.setId(1);
		user.setUsername("j3dk");
		user.setPassword("998");
		String xmlPath = "spring_properties/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		// 获得代理类
		UserDao userDao=(UserDao) applicationContext.getBean("userDaoId");
		userDao.update(user);
	
	}
}
