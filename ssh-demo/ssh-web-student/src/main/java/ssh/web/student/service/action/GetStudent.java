package ssh.web.student.service.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/27/13
 * Time: 6:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class GetStudent extends ActionSupport {

    private String stuName;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
