package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.PersonService;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class MySpringTest {

    @Test
    public void PersonServiceTest() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(context);

        PersonService p = context.getBean("personService", PersonService.class);
        p.info();
    }
}
