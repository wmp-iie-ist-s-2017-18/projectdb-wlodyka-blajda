package blajda.andzelika.app.movies.dao;

import blajda.andzelika.app.movies.model.Watched;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.StoredProcedureQuery;

import java.sql.SQLIntegrityConstraintViolationException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import javax.persistence.StoredProcedureQuery;
import javax.swing.JOptionPane;
import org.hibernate.SQLQuery;
import org.hibernate.jdbc.Work;
import org.hibernate.loader.custom.sql.SQLCustomQuery;

public class WatchedDao {

    SessionFactory factory;

    public EntityManagerFactory emf;

    public WatchedDao(SessionFactory factory) {
        this.factory = factory;
    }

    public void addMovie(String movie_id, String movie, String description, String raiting, String watched, String wmovie_id) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.doWork(new Work() {
            @Override
            public void execute(Connection cnctn) throws SQLException {
                CallableStatement query = cnctn.prepareCall("{call `procedure`(?,?,?,?,?,?)}");
                query.setInt(1, Integer.valueOf(movie_id));
                query.setString(2, movie);
                query.setString(3, description);
                query.setInt(4, Integer.valueOf(raiting));
                query.setInt(5, Integer.valueOf(watched));
                query.setInt(6, Integer.valueOf(wmovie_id));
                query.execute();
                
            }
            
        }); 
        transaction.commit();
        session.close();
//        Query query = session.createNativeQuery("{CALL procedure('?','?','?','?','?','?')}");
//        query.setParameter(1, movie_id);
//        query.setParameter(2, movie);
//        query.setParameter(3, description);
//        query.setParameter(4, raiting);
//        query.setParameter(5, watched);
//        query.setParameter(6, wmovie_id);
//
//        List list = query.getResultList();

//        PRAWIE DZIA£AJ¥CY KOD ALE NA ENTITY MENAGERZE 
//        EntityManager em = emf.createEntityManager();
////        //EntityManager em = session.getSessionFactory().createEntityManager();   
//        em.getTransaction().begin();
//        String procedura = "SET @p0='?'; SET @p1='?'; SET @p2='?'; SET @p3='?'; SET @p4='?'; SET @p5='?';"
//                       + " CALL `procedure`(@p0, @p1, @p2, @p3, @p4, @p5);";
//Query q = .createNativeQuery(procedura, "procedure");
//q.setParameter( 1, movie_id );
//q.setParameter( 2, movie );
//q.setParameter( 3, description);
//q.setParameter( 4, raiting);
//q.setParameter( 5, watched);
//q.setParameter( 6, wmovie_id);
//
//q.getResultList();
//        
//          PRAWIE DZIA£AJ¥CE NATIVE QUERY
//        Session session = factory.openSession();
//                int val = session.createNativeQuery("SET @p0=':m0'; SET @p1=':m1'; SET @p2=':m2'; SET @p3=':m3'; SET @p4=':m4'; SET @p5=':m5';"
//                        + " CALL `procedure`(@p0, @p1, @p2, @p3, @p4, @p5);")
//                .setParameter("1", movie_id)
//                .setParameter("2", movie)
//                .setParameter("3", raiting)
//                .setParameter("4", description)
//                .setParameter("5", watched)
//                .setParameter("6", wmovie_id)
//                .executeUpdate();
//        session.close();
//        return val != 0? true : false;
//    
//        Session session = factory.openSession();
//        //emf = session.getSessionFactory().createEntityManager();
//        emf = Persistence.createEntityManagerFactory("test");
//
//        EntityManager em = emf.createEntityManager();
//        //EntityManager em = session.getSessionFactory().createEntityManager();   
//        em.getTransaction().begin();
//        
////        try {
//            StoredProcedureQuery query = em.createNamedStoredProcedureQuery("procedure");
//            query.setParameter("movie_id", movie_id);
//            query.setParameter("movie", movie);
//            query.setParameter("description", description);
//            query.setParameter("raiting", raiting);
//            query.setParameter("watched", watched);
//            query.setParameter("wmovie_id", wmovie_id);
//            query.execute();
//        
//            em.getTransaction().commit();
//        
////        } catch (PersistenceException e) {
////            return false;
////        } finally {
//            em.close();
//            emf.close();
//            session.save(watched);
//        session.close();
////        } return true;
       // return true;

    }

//    public void addWatched(String m1) {
//        
//  
////        
////        
////        Query query = session.createSQLQuery(
////	"CALL GetStocks(:stockCode)")
////	.addEntity(Stock.class)
////	.setParameter("stockCode", "7277");
////			
////List result = query.list();
////for(int i=0; i<result.size(); i++){
////	Stock stock = (Stock)result.get(i);
////	System.out.println(stock.getStockCode());
////}
//        
//        
////        Session session = factory.openSession();
////        Query query = session.createQuery("SET @p0='wwwww'; SET @p1='22'; SET @p2='wwwww'; SET @p3='22'; SET @p4='22'; SET @p5='1'; SELECT `funkcja11`(@p0, @p1, @p2, @p3, @p4, @p5) AS `funkcja11`;");
////        query.setParameter("m1", m1);
////        session.beginTransaction();
//        
////        Session session = factory.openSession();
////        Query query = session.createQuery("from Watched c where c.movie =:movie");
////        query.setParameter("movie", movie);
////        return (Watched) query.getSingleResult();
//        
////        int a = 0;
//////        session.getSessionFactory().;
////       a = (int)session.createNativeQuery(query).getSingleResult();
////        session.getTransaction().commit();
////        session.close();        
////        System.out.print(a+"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//    }
    public void saveWatched(Watched watched) {
        Session session = factory.openSession();
        session.save(watched);
        session.close();
    }

    public void deleteWatched(Watched watched) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(watched);
        transaction.commit();
        session.close();
    }

    public Watched getById_movie(Long id_movie) {
        Session session = factory.openSession();
        Watched watched = session.get(Watched.class, id_movie);
        session.close();
        return watched;
    }

    public Watched getByName(String movie) {
        Session session = factory.openSession();
        Query query = session.createQuery("from Watched c where c.movie =:movie");
        query.setParameter("movie", movie);
        return (Watched) query.getSingleResult();
    }

//    public Watched getRaiting(Long raiting){
//        Session session = factory.openSession();
//        Watched watched = session.get(Watched.class, raiting);
//        session.close();
//        return watched;
//    }
//    
//    public Watched getDescription(String description){
//        Session session = factory.openSession();
//        Watched watched = session.get(Watched.class, description);
//        session.close();
//        return watched;
//    }
//    
    public void watchedFunction(Watched watched, int p1) {

//       
//       Session session;
//          session = factory.openSession();
//        String query = "SELECT `funkcja11`(?, ?, ?, ?, ?, ?) AS `funkcja11`;";
//        
//        session.doWork(new Work(){
//           @Override
//           public void execute(Connection cnctn) throws SQLException {
//               PreparedStatement preparedStatement = cnctn.prepareStatement(query);
//               preparedStatement.setInt(1, p1);
//
////throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//           }
//            
//        });
//        session.beginTransaction();
//        
//        int a = 0;
//        //session.getSessionFactory();
//       a = (int)session.createNativeQuery(query).getSingleResult();
//        session.getTransaction().commit();
//        session.close();        
//        System.out.print(a+"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//       
//       
//        Session session = factory.openSession();
//        String query = "SET @p0='2'; SET @p1='sdafsdf'; SET @p2='77'; SET @p3='wwww'; SET @p4='1'; SET @p5='2'; CALL `procedure`(@p0, @p1, @p2, @p3, @p4, @p5);";
//        session.beginTransaction();
//        session.getSessionFactory();
//        session.getTransaction().commit();
//        session.close();        
    }

    public List<Watched> getAll() {
        Session session = factory.openSession();
        Query query = session.createQuery("from Watched");
        List list = query.getResultList();
        if (list != null) {
            return list;
        } else {
            return Collections.emptyList();
        }
    }

}
