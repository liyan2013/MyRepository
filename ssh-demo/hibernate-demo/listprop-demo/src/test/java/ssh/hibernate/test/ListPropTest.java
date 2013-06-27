package ssh.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import ssh.hibernate.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/24/13
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListPropTest {

    @Test
    public void test01() throws Exception{
        Configuration config = new Configuration().configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Person liyan = new Person();
        liyan.setAge(24);
        liyan.setName("Liyan");
        List<String> schools = new ArrayList<String>();
        schools.add("List School 01");
        schools.add("List School 02");
        liyan.setSchools(schools);
        session.save(liyan);
        transaction.commit();
        session.close();
    }
}
