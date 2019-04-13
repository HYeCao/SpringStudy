package spring_jdbcDaoSupport;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestSupport {

	@Test
	public void demo01() {
		User user=new User();
		user.setId(1);
		user.setUsername("jack");
		user.setPassword("998");
		String xmlPath = "spring_jdbcDaoSupport/Beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		// ��ô�����
		UserDao userDao=(UserDao) applicationContext.getBean("userDaoId");
		userDao.update(user);
		
		
	
	}
}
