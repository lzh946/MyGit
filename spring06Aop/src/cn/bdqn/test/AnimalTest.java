package cn.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.dao.Animal;

public class AnimalTest {
	@Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 使用代理对象进行操作
		Animal animal = (Animal) context.getBean("proxyFactoryBean");
		animal.eat();
		System.out.println("***********");
		animal.sleep();
	}

	@Test
	public void test02() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 使用代理对象进行操作
		Animal animal = (Animal) context.getBean("proxyFactoryBean");
		System.out.println(animal.eat());
		System.out.println("***********");
		animal.sleep();
	}
}
