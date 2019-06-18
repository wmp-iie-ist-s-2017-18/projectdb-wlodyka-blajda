package blajda.andzelika.app.movies.dao;

import blajda.andzelika.app.movies.model.Movie;
import blajda.andzelika.app.movies.model.Watched;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

public class MovieDao {
    SessionFactory factory;

    public MovieDao(SessionFactory factory) {
        this.factory = factory;
    }

    public void saveCategory(Movie movie){
        Session session = factory.openSession();
        session.save(movie);
        session.close();
//
//    
//        session = factory.openSession();
//        String query = "SELECT `funkcja11`(@p0, @p1, @p2, @p3, @p4, @p5) AS `funkcja11`";
//        session.beginTransaction();
//        
//        int a = 0;
//      //  session.getSessionFactory().;
//       a = (int)session.createNativeQuery(query).getSingleResult();
//        session.getTransaction().commit();
//        session.close();        
//        System.out.print(a+"AAAAAAAAAAAAAAAAAAAAAA");
        
        
        
    }

    public void deleteCategory(Movie movie){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(movie);
        transaction.commit();
        session.close();
    }

    public Movie getById(Long id){
        Session session = factory.openSession();
        Movie movie = session.get(Movie.class, id);
        session.close();
        return movie;
    }

    public List<Movie> getAll(){
        Session session = factory.openSession();
        Query query = session.createQuery("from Movie");
        List list = query.getResultList();
        if (list != null) {
            return list;
        } else {
            return Collections.emptyList();
        }
    }
    
   
}
