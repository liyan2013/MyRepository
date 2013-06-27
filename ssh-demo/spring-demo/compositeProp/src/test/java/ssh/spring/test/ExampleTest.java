package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.ExampleBean;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ExampleBean example = context.getBean("eB", ExampleBean.class);
        System.out.println(example.getPerson().getName());
    }
}
