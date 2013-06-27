package ssh.hibernate.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/24/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private Integer id;
    private String name;
    private Integer age;

    private List<String> schools = new ArrayList<String>();

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }
}
