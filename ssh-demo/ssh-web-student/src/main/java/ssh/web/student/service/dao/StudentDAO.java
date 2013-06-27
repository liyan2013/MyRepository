package ssh.web.student.service.dao;

import ssh.web.student.service.Student;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/27/13
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface StudentDAO {

    public Student get(Integer id) throws Exception;
    public Integer save(Student student) throws Exception;
    public void update(Student student) throws Exception;
    public void delete(Integer id) throws Exception;
    public void delete(Student student) throws Exception;

}
