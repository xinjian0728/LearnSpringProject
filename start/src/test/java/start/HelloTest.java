package start;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yexj.learn.spring.start.Hello;

public class HelloTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Hello hello = (Hello)context.getBean("hello");
		hello.sayHello("yexj");
	}
}
