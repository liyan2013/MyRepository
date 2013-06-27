package ssh.spring.factory;

import ssh.spring.service.Being;
import ssh.spring.service.impl.Cat;
import ssh.spring.service.impl.Dog;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeingFactory {

    public static Being getBeing(String arg){
        if(arg.equalsIgnoreCase("dog")){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
