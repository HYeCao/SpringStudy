package spring_AspectJ_Annotation;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ��������ȷ��֪ͨ����Ҫʵ�ֲ�ͬ�ӿڣ��ӿھ��ǹ淶���Ӷ���ȷ���������ơ�
 * * ���á�����֪ͨ�� MethodInterceptor
 *
 */
	/**
	 * �����࣬���ж��֪ͨ
	 */
@Component
@Aspect
public class MyAspect {
	
	//����㵱ǰ��Ч
//	@Before("execution(* spring_AspectJ_Annotation.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint){
		System.out.println("ǰ��֪ͨ �� " + joinPoint.getSignature().getName());
	}
	
	//�������������
	@Pointcut("execution(* spring_AspectJ_Annotation.UserServiceImpl.*(..))")
	private void myPointCut(){
	}
	
//	@AfterReturning(value="myPointCut()" ,returning="ret")
	public void myAfterReturning(JoinPoint joinPoint,Object ret){
		System.out.println("����֪ͨ �� " + joinPoint.getSignature().getName() + " , -->" + ret);
	}
	
//	@Around(value = "myPointCut()")
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("ǰ");
		//�ֶ�ִ��Ŀ�귽��
		Object obj = joinPoint.proceed();
		
		System.out.println("��");
		return obj;
	}
	
	@AfterThrowing(value="execution(* spring_AspectJ_Annotation.UserServiceImpl.*(..))" ,throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
		System.out.println("�׳��쳣֪ͨ �� " + e.getMessage());
	}
	
//	@After("myPointCut()")
	public void myAfter(JoinPoint joinPoint){
		System.out.println("����֪ͨ");
	}

}
