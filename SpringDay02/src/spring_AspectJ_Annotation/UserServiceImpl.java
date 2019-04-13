package spring_AspectJ_Annotation;

import org.springframework.stereotype.Component;

@Component("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public  void addUser() {
		System.out.println("spring_AspectJ_Annotation add a user");
	}

	@Override
	public void updateUser() {
		System.out.println("spring_AspectJ_Annotation add a user");
	
	}

	@Override
	public void deleteUser() {
		System.out.println("spring_AspectJ_Annotation add a user");

	}

}
