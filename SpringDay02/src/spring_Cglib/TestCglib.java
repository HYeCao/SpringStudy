package spring_Cglib;

import org.junit.Test;

public class TestCglib {


  @Test
  public void demo02(){
	  UserServiceImpl userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();

  }
  
}
