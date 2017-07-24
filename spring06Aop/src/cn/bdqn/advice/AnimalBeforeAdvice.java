package cn.bdqn.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AnimalBeforeAdvice implements MethodBeforeAdvice {
	/**
	 * method:执行的方法
	 * args:方法的参数
	 * target:目标类对象
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("进入了  前置  增强 ..........MethodBeforeAdvice");
	}

}
