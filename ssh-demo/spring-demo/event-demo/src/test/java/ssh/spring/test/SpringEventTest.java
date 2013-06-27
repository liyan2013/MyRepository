package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.event.EmailEvent;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpringEventTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        EmailEvent ele = new EmailEvent("hello", "test@126.com", "this is a spring test");

        context.publishEvent(ele);
    }

}
