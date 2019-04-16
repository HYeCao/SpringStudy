import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.AccountService;

public class TestApp {
	public static void main(String[] args) {
		String xmlPath = "ApplicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService =  (AccountService) applicationContext.getBean("accountServiceImplId");
		accountService.transfer("jack", "rose", 800);
	}


}
