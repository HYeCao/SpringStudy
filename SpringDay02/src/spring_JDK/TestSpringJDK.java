package spring_JDK;

import org.junit.Test;

public class TestSpringJDK {


  @Test
  public void demo02(){
	  UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();

  }
  
}
