package ssh.web.student.service.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ssh.web.student.service.Student;
import ssh.web.student.service.dao.impl.StudentDAOService;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/27/13
 * Time: 6:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PutStudent extends ActionSupport {

    private static Log log = LogFactory.getLog(PutStudent.class);

    private Integer id;
    private String stuName;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String execute() throws Exception {

        Student student = new Student();
        student.setStudentId(id);
        student.setName(stuName);
        student.setAge(age);

        try {
            log.info("Post Student: " + id);
            log.info("Name: " + stuName);
            log.info("Age: " + age);
            StudentDAOService.getInstance().update(student);
            log.info("===============After update================");
            Student stu = StudentDAOService.getInstance().get(id);
            log.info("Name: " + stu.getName());
            log.info("Age: " + stu.getAge());
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
}
