package SessionFactoryConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
    private SessionFactory sessionFactory;

    public SessionFactory init() {

        return sessionFactory = new Configuration().configure().buildSessionFactory();
    }
}
