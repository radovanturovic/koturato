import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import rvg.sots.CoursesEntity;

/**
 * Created by charmingc0d3r on 4.11.16..
 */
public class TestHajbernejtKlasa {

    public static void main(String[] args) {
        Configuration c = new Configuration();
        c.configure("hibernate.config.xml");

        // creating seession factory object
        SessionFactory factory = c.buildSessionFactory();

        // creating session object
        Session session = factory.openSession();

        // creating transaction object
        //Transaction t = session.beginTransaction();

        Query query = session.createQuery("from CoursesEntity");
        java.util.List list = query.list();
        System.out.println(list);
        for (Object o: list
             ) {
            CoursesEntity ce = (CoursesEntity) o;
            System.out.println("ce.getName() = " + ce.getName());
        }
        //t.commit();
        session.close();
        factory.close();
    }
}
