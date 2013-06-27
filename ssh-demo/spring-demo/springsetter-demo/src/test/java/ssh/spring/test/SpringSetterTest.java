package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssh.spring.service.impl.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class SpringSetterTest {

    @Test
    public void test01() throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Chinese person01 = context.getBean("person01", Chinese.class);
        person01.useAxe();

        Chinese person02 = context.getBean("person02", Chinese.class);
        person02.useAxe();
    }

}
