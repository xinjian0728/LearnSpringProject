package chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yexj.learn.spring.chapter3.HelloApi;

public class Chapter3Test {

	@Test
	public void test(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		// 索引的方式
		HelloApi hello = beanFactory.getBean("byIndex", HelloApi.class);
		hello.sayHello();
		// 类型的方式
		HelloApi hello1 = beanFactory.getBean("byType", HelloApi.class);
		hello1.sayHello();
		// 名称的方式
		HelloApi hello2 = beanFactory.getBean("byName", HelloApi.class);
		hello2.sayHello();
	}
	
	@Test
	public void testSetter(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		HelloApi hello = (HelloApi)context.getBean("bySetter");
		hello.sayHello();
	}
	
}
