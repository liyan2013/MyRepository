package ssh.spring.service.impl;

import ssh.spring.service.Axe;
import ssh.spring.service.Person;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 5/31/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chinese implements Person {

    public String sayHello(String name){
        String msg = "Chinese: " + name + ", hello!";
        System.out.println(msg);
        return msg;
    }

    public String sayBye(String name){
        String msg = "Chinese: " + name + ", bye!";
        System.out.println(msg);
        return msg;
    }
}
