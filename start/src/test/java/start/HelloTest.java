package start;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.yexj.learn.spring.start.Hello;

public class HelloTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.sayHello("yexj");
		// 测试使用类名来从容器中获取
		Hello h = (Hello)context.getBean(Hello.class);
		h.sayHello("ye");
	}
	
	// 加载资源的方式
	@Test
	public void test2(){
		File file = new File("src/main/resources/application.xml");
		Resource resource = new FileSystemResource(file);
		BeanFactory factory = new XmlBeanFactory(resource);
		Hello hello = (Hello)factory.getBean("hello");
		hello.sayHello("小叶");
	}
	
	
}
