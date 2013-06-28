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
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostStudent extends ActionSupport {

    private static Log log = LogFactory.getLog(PostStudent.class);

    private String stuName;
    private Integer age;

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
        student.setName(stuName);
        student.setAge(age);

        try {
            log.info("Post Student: ");
            log.info("Name: " + student.getName());
            log.info("Age: " + student.getAge());
            StudentDAOService.getInstance().save(student);
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
}
