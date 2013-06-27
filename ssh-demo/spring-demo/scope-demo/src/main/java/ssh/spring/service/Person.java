package ssh.spring.service;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/20/13
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String uuid = null;

    public Person(){
        System.out.println("Initialize Person...");
    }

    @Override
    public String toString(){

        if(uuid == null){
            uuid = UUID.randomUUID().toString();
        }
        return uuid;
    }
}
