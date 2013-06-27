package ssh.spring.service.impl;

import ssh.spring.service.Being;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/21/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog implements Being {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void testBeing(){
        System.out.println(msg);
    }
}
