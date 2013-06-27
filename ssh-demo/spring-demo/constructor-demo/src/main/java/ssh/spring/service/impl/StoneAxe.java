package ssh.spring.service.impl;

import ssh.spring.service.Axe;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 5/31/13
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoneAxe implements Axe{

    @Override
    public String chop(){
        return "I am using a Stone Axe!!!";
    }
}
