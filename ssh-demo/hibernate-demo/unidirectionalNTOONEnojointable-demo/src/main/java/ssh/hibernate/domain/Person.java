package ssh.hibernate.domain;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/26/13
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private Integer id;
    private String name;
    private int age;
    private Address address;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
