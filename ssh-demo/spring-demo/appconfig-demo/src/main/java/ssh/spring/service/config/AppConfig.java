package ssh.spring.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ssh.spring.service.Axe;
import ssh.spring.service.Person;
import ssh.spring.service.impl.Chinese;
import ssh.spring.service.impl.SteelAxe;
import ssh.spring.service.impl.StoneAxe;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */

@Configuration
public class AppConfig {

    @Value("Liyan") String personName;

    @Bean(name="p1")
    public Person person(){
        Chinese p = new Chinese();
        p.setAxe(stoneAxe());
        p.setName(personName);
        return p;
    }

    @Bean(name="stoneAxe")
    public Axe stoneAxe(){
        return new StoneAxe();
    }

    @Bean(name="steelAxe")
    public Axe steelAxe(){
        return new SteelAxe();
    }
}
