package ssh.web.student.service.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.hibernate3.HibernateTemplate;
import ssh.web.student.service.Student;
import ssh.web.student.service.dao.StudentDAO;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/27/13
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentDAOService implements StudentDAO, InitializingBean{

    private HibernateTemplate ht;
    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        ht = new HibernateTemplate(sf);
    }

    public Student get(Integer id) throws Exception{
        return ht.get(Student.class, id);
    }

    public Integer save(Student student) throws Exception{
        return (Integer)ht.save(student);
    }

    public void update(Student student) throws Exception{
        ht.update(student);
    }

    public void delete(Integer id) throws Exception{
        ht.delete(get(id));
    }

    public void delete(Student student) throws Exception{
        ht.delete(student);
    }
}
