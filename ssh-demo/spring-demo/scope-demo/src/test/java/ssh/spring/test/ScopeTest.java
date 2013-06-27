package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.Person;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScopeTest {

    @Test
    public void test01() throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("Starting test...");
        Person p11 = context.getBean("p1", Person.class);
        System.out.println(p11.toString());

        Person p12 = context.getBean("p1", Person.class);
        System.out.println(p12.toString());

        System.out.println(p11 == p12);

        Person p21 = context.getBean("p2", Person.class);
        System.out.println(p21.toString());

        Person p22 = context.getBean("p2", Person.class);
        System.out.println(p22.toString());

        System.out.println(p21 == p22);
    }
}
