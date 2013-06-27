package ssh.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ssh.spring.service.config.AppConfig;
import ssh.spring.service.impl.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class AppConfigTest {

    @Test
    public void test01() throws Exception{
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Chinese p1 = context.getBean("p1", Chinese.class);
        System.out.println(p1.getName());
        p1.useAxe();
    }
}
