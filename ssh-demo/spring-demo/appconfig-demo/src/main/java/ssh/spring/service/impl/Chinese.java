package ssh.spring.service.impl;

import ssh.spring.service.Axe;
import ssh.spring.service.Person;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/19/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chinese implements Person{

    private Axe axe;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe(){
        System.out.println("I am " + name + " \n" + axe.chop());
    }
}
