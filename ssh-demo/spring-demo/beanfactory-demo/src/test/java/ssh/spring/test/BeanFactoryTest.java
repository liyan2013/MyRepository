package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeanFactoryTest {

    @Test
    public void test01() throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Chinese p = context.getBean("chinese", Chinese.class);
        System.out.println(context.hashCode());
        System.out.println(p.getApplicationContext().hashCode());
        System.out.println(p.getApplicationContext() == context);
        System.out.println(p.getApplicationContext().equals(context));

    }
}
