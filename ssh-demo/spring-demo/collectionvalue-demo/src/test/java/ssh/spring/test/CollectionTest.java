package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.impl.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionTest {

    @Test
    public void test01()throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Chinese p1 = context.getBean("p1", Chinese.class);
        System.out.println(p1.getBooks().toString());
        System.out.println(p1.getAxes().toString());
        System.out.println(p1.getHealth().toString());
        System.out.println(p1.getPhaseAxes().toString());
        System.out.println(p1.getSchools().toString());
        System.out.println(p1.getScores().toString());
    }
}
