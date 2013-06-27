package ssh.spring.service.factory;

import org.springframework.beans.factory.FactoryBean;
import ssh.spring.service.Person;
import ssh.spring.service.impl.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonFactory implements FactoryBean<Person> {

    Person p = null;

    public Person getObject(){
        if(p == null){
            p = new Chinese();
        }
        return p;
    }

    public Class<? extends Person> getObjectType(){
        return Chinese.class;
    }

    public boolean isSingleton(){
        return true;
    }

}
