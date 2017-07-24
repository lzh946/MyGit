package cn.bdqn.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AnimalAfterAdvice implements AfterReturningAdvice {
	/**
	 * returnValue:返回值, 能获取返回值 但是如果对返回值进行了操作！没有意义！
	 * afterReturning()就没有返回值
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg,
			Object target) throws Throwable {
		System.out.println("进行了 后置 通知...........AfterReturningAdvice");
	}

}
