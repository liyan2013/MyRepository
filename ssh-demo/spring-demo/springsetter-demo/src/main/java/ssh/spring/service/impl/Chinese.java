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

    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe(){
        System.out.println(axe.chop());
    }
}
