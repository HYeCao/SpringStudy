package spring_Coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ��Լ��ϵ�����ע��
 * @author dell
 *
 */
public class TestColl {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring_Coll/Beans.xml");
	     CollData collData=(CollData) context.getBean("collDataId"); 
	   System.out.println(collData);
	}
}
