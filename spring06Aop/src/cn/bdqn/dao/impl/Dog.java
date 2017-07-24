package cn.bdqn.dao.impl;

import cn.bdqn.dao.Animal;

public class Dog implements Animal {
	/*
	 * 专心我们的逻辑
	 * 至于方法之前和方法之后要做的事情！我不关注！
	 * Ioc:降低了主业务的耦合度
	 * Aop:降低了主业务和交叉业务逻辑之间的耦合度
	 */
	@Override
	public String eat() {
		System.out.println("Dog在吃骨头");
		return "abcd";
	}

	@Override
	public void sleep() {
		System.out.println("Dog睡觉");
	}

}
