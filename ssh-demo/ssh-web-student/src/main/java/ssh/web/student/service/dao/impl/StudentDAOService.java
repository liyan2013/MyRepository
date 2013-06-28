package ssh.web.student.service.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
public class StudentDAOService implements StudentDAO{

    private HibernateTemplate ht;
    private SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }

    public StudentDAOService(){}

    public StudentDAOService(SessionFactory sf){
        this.sf = sf;
        ht = new HibernateTemplate(sf);
    }

    private static StudentDAOService service;
    public static StudentDAOService createStudentDAOService(SessionFactory sf){
        if(service == null){
            service = new StudentDAOService(sf);
        }

        return service;
    }

    public static StudentDAOService getInstance() throws Exception{
        if(service == null){
            throw new Exception("StudentDAOService hasn't been initialized");
        }

        return service;
    }

    public Student get(Integer id) throws Exception{
        return ht.get(Student.class, id);
    }

    public Integer save(Student student) throws Exception{
        System.out.println(sf.toString());
        System.out.println(ht.toString());
        Session session = sf.openSession();
        session.close();
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
