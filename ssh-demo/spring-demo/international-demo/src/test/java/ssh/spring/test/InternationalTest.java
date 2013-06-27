package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 11:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class InternationalTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        String [] strs = {"2", "3"};
        String one = context.getMessage("one", strs, Locale.US);
        System.out.println(one);

        String two = context.getMessage("two", strs, Locale.CHINA);
        System.out.println(two);
    }
}
