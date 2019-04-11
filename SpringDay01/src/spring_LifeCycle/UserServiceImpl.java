package spring_LifeCycle;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("spring_LifeCycle add a user");
	}
	public void myInit(){
		System.out.println("³õÊ¼»¯");
	}
	public void myDestroy(){
		System.out.println("Ïú»Ù");
	}

}
