package chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yexj.learn.spring.chapter3.HelloApi;

public class Chapter3Test {

	@Test
	public void test(){
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		// �����ķ�ʽ
		HelloApi hello = beanFactory.getBean("byIndex", HelloApi.class);
		hello.sayHello();
		// ���͵ķ�ʽ
		HelloApi hello1 = beanFactory.getBean("byType", HelloApi.class);
		hello1.sayHello();
		// ���Ƶķ�ʽ
		HelloApi hello2 = beanFactory.getBean("byName", HelloApi.class);
		hello2.sayHello();
	
	}
	
}
