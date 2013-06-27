package ssh.spring.service;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 5/31/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Personal name: " + name);
    }
}
