package ssh.spring.service.factory;

import ssh.spring.service.Person;
import ssh.spring.service.impl.American;
import ssh.spring.service.impl.Chinese;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonFactory {

    public Person getPerson(String country){
        if(country.equalsIgnoreCase("US")){
            return new American();
        }else {
            return new Chinese();
        }
    }
}
