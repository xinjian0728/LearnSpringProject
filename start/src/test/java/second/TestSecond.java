package second;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yexj.learn.spring.second.HelloApi;
/**
 * 实例化Bean
 * <p>Spring IoC容器如何实例化Bean呢？传统应用程序可以通过new和反射方式进行实例化Bean。而Spring IoC容器则需要根据Bean定义里的配置元数据使用反射机制来创建Bean。在Spring IoC容器中根据Bean定义创建Bean主要有以下几种方式：</p>
 * <ol>
 * <li>一、使用构造器实例化Bean</li>
 * <li>二、使用静态工厂方式实例化Bean，静态方法</li>
 * <li>三、使用实例工厂方法实例化Bean，不能是静态方法</li>
 * </ol>
 * 注意区别
 * @author yexj
 *	
 *	
 */
public class TestSecond {
	
	
	@Test
	public void testBeanByConstructor(){
		// 使用构造器
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		// 无参数构造器 -- 没有设置
		HelloApi hello = (HelloApi)beanFactory.getBean("helloApi",HelloApi.class);
		hello.sayHello();// Hello world!
		// 有参数的构造器 -- 在xml中设置
		HelloApi hello2 = (HelloApi)beanFactory.getBean("helloApi2",HelloApi.class);
		hello2.sayHello();// Hello Spring!
	}
	
	@Test
	public void testBeanByInstanceFactory(){
		// 使用静态工厂 -- 对象是由静态工厂创建的
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		HelloApi hello = (HelloApi)beanFactory.getBean("helloFactory");
		hello.sayHello();// Hello Great Spring!
	}
	
	@Test
	public void testInstantiatingBeanByInstanceFactory() {
		//使用实例工厂方法
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		HelloApi hello = (HelloApi)beanFactory.getBean("helloFactory2");
		hello.sayHello();
	}
	
}
