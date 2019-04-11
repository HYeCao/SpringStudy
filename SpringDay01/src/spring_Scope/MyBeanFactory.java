package spring_Scope;

public class MyBeanFactory {
	
	/**
	 * ´´½¨ÊµÀý
	 * @return
	 */
	public  UserService createService(){
		return new UserServiceImpl();
	}
}
