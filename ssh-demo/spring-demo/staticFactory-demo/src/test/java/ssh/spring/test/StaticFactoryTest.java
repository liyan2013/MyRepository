package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.Being;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class StaticFactoryTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Being cat = context.getBean("cat", Being.class);
        cat.testBeing();

        Being dog = context.getBean("dog", Being.class);
        dog.testBeing();
    }
}
