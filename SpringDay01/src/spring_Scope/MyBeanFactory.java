package spring_Scope;

public class MyBeanFactory {
	
	/**
	 * ����ʵ��
	 * @return
	 */
	public  UserService createService(){
		return new UserServiceImpl();
	}
}
