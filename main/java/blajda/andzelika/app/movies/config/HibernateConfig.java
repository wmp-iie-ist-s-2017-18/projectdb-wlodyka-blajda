package blajda.andzelika.app.movies.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//Klasa konfiguracyjna Hibernate i bazy danych.
public class HibernateConfig {
    private SessionFactory sf;

    public HibernateConfig() {
        this.sf = configureSessionFactory();
    }

    private SessionFactory configureSessionFactory() {
        try {
            Configuration config = new Configuration();
            config.configure();
            sf = config.buildSessionFactory();
            System.out.println("Session factory creation success.");
            return  sf;
        } catch (Throwable ex){
            System.err.println("Session factory creation failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public SessionFactory getSessionFactory(){
        return sf;
    }
}
