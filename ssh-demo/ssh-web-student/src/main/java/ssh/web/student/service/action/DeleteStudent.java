package ssh.web.student.service.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ssh.web.student.service.dao.impl.StudentDAOService;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/27/13
 * Time: 6:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class DeleteStudent extends ActionSupport{

    private static Log log = LogFactory.getLog(DeleteStudent.class);

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {

        try {
            log.info("Delete Student: " + id);
            StudentDAOService.getInstance().delete(id);
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
}
