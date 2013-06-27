package ssh.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ssh.hibernate.domain.News;

/**
 * Created with IntelliJ IDEA.
 * User: liyanwang
 * Date: 6/24/13
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class NewsTest {

    Configuration config = null;
    SessionFactory sf = null;
    Session session = null;

    @Before
    public void beforeTest() throws Exception{
        config = new Configuration().configure();
        sf = config.buildSessionFactory();
        session = sf.openSession();
    }

    @After
    public void afterTest() throws Exception{
        if(session.isOpen()){
            session.close();
        }
        if(!sf.isClosed()){
            sf.close();
        }
    }

    @Test
    public void test01() throws Exception{

        Transaction tx = session.beginTransaction();
        News n = new News();
        n.setTitle("Test Title");
        n.setContent("Test Content");
        session.save(n);
        tx.commit();
    }

    @Test
    public void test02() throws Exception{
        int i = 6;
        News n = (News)session.get(News.class, new Integer(i));
        System.out.println(n.getFullContent());
    }

    @Test
    public void test03() throws Exception{
        int i = 7;
        News n = (News)session.get(News.class, new Integer(i));
        session.close();

        n.setTitle("New Title");
        n.setContent("New Content");
        Session session2 = sf.openSession();
        Transaction tx = session2.beginTransaction();
        session2.update(n);
        tx.commit();
    }

}
