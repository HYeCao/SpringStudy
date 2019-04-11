package spring_static_Factory;

public class MyBeanFactory {
	
	/**
	 * ´´½¨ÊµÀý
	 * @return
	 */
	public static UserService createService(){
		return new UserServiceImpl();
	}
}
