package spring_static_Factory;

public class MyBeanFactory {
	
	/**
	 * ����ʵ��
	 * @return
	 */
	public static UserService createService(){
		return new UserServiceImpl();
	}
}
