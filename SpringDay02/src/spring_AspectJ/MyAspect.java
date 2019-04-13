package spring_AspectJ;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ��������ȷ��֪ͨ����Ҫʵ�ֲ�ͬ�ӿڣ��ӿھ��ǹ淶���Ӷ���ȷ���������ơ�
 * * ���á�����֪ͨ�� MethodInterceptor
 *
 */
	/**
	 * �����࣬���ж��֪ͨ
	 */
	public class MyAspect {
		
		public void myBefore(JoinPoint joinPoint){
			System.out.println("ǰ��֪ͨ �� " + joinPoint.getSignature().getName());
		}
		
		public void myAfterReturning(JoinPoint joinPoint,Object ret){
			System.out.println("����֪ͨ �� " + joinPoint.getSignature().getName() + " , -->" + ret);
		}
		
		public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
			System.out.println("ǰ");
			//�ֶ�ִ��Ŀ�귽��
			Object obj = joinPoint.proceed();
			
			System.out.println("��");
			return obj;
		}
		
		public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
			System.out.println("�׳��쳣֪ͨ �� " + e.getMessage());
		}
		
		public void myAfter(JoinPoint joinPoint){
			System.out.println("����֪ͨ");
		}


	
}

