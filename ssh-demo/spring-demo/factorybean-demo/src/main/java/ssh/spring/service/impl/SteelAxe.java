package ssh.spring.service.impl;

import ssh.spring.service.Axe;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 5/31/13
 * Time: 3:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class SteelAxe implements Axe {

    @Override
    public String chop(){
        return "You are using a Steel Axe!!!";
    }
}
