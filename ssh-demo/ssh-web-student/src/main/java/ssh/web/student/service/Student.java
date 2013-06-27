package ssh.web.student.service;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/26/13
 * Time: 5:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student implements Person{

    private Integer studentId;
    private String name;
    private Integer age;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
}
