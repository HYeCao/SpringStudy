package spring_Factory;

public class MyBeanFactory {
	
	/**
	 * ´´½¨ÊµÀý
	 * @return
	 */
	public  UserService createService(){
		return new UserServiceImpl();
	}
}
