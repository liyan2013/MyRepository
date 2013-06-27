package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.Person;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class FactoryTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person ch = context.getBean("ch", Person.class);
        ch.sayBye("Liyan");
        ch.sayHello("Liyan");

        Person us = context.getBean("us", Person.class);
        us.sayBye("Liyan");
        us.sayHello("Liyan");
    }
}
