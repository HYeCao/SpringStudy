package spring_Factory;

public class MyBeanFactory {
	
	/**
	 * ����ʵ��
	 * @return
	 */
	public  UserService createService(){
		return new UserServiceImpl();
	}
}
