package cn.bdqn.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AnimalAroundAdvice implements MethodInterceptor {
	/**
	 * 环绕增强 是在前置增强之后 和后置增强之前执行
	 * 可以对方法的返回值进行一系列的操作
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("方法之前.......MethodInterceptor");
		Object result = invocation.proceed();
		// 判断是否有返回值
		if (result != null) {
			result = ((String) result).toUpperCase();
		}

		System.out.println("方法之后......MethodInterceptor");
		return result;
	}

}
