package start;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yexj.learn.spring.start.First;
/**
 * Spring Bean命名的4中方式<br/>
 * <p>
 * 每个Bean可以有一个或多个id（或称之为标识符或名字），在这里我们把第一个id称为“标识符”，其余id叫做“别名”；这些id在IoC容器中必须唯一。
 * </p>
 * <ol>
 * 	<li>一、	不指定id，只配置必须的全限定类名，由IoC容器为其生成一个标识，客户端必须通过接口"T getBean(Class<T> requiredType)"获取Bean;<bean class="xxx.HelloImpl"/></li>
 * 	<li>二、指定id，必须在Ioc容器中唯一；<bean id="bean" class="cn.java.xxx.xxImpl"/></li>
 * 	<li>三、指定name，这样name就是“标识符”,必须在Ioc容器中唯一;<bean name="bean" class="cn.javas.xxx.Impl" /></li>
 * 	<li>四、指定id和name，id就是标识符，而name就是别名，必须在Ioc容器中唯一；</li>
 * 	<li>五、指定多个name，多个name用“，”、“；”、“ ”分割，第一个被用作标识符，其他的（alias1、alias2、alias3）是别名，所有标识符也必须在Ioc容器中唯一；</li>
 * 	<li>六、使用<alias>标签指定别名，别名也必须在IoC容器中唯一<alias alias="alias1" name="bean"/></li>
 * </ol>
 * @author yexj
 *
 */
public class FirstTest {

	@Test
	public void testFirst() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("application.xml");
		// 1.不指定id
		//beanFactory.getBean(First.class);
		
		// 2.指定id
		//beanFactory.getBean("beanId");
		
		// 3.指定name，使用与指定id的方式相同
		
		// 4.指定id和name时的测试
		First first = (First) beanFactory.getBean("firstName");
		System.out.println(first.say("小叶"));
		First first1 = (First) beanFactory.getBean("first");
		System.out.println(first1.say("小叶1"));
		
		String[] alias = beanFactory.getAliases("firstName");
		System.out.println(Arrays.toString(alias));
		/*for(String str : alias){
			System.out.println(str);
		}*/
		
	}
	
}
