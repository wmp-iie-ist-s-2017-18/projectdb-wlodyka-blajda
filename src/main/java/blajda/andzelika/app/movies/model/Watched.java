package blajda.andzelika.app.movies.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import javax.persistence.EntityManager;

@Entity
@Table(name = "WATCHED")



@NamedNativeQueries({
	@NamedNativeQuery(
	name = "callProcedure",
	query = "CALL `procedure`(':m0',':m1',':m2',':m3',':m4',':m5');",
	resultClass = Watched.class
	)
})
//PROCEDURA Z NAMEDSTOREDQUERY
//@NamedStoredProcedureQuery(
//        name = "procedure",
//        procedureName = "procedura",
//        parameters = {  @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "movie_id"),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "movie"),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "raiting"),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "description"),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "watched"),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "wmovie_id")
//                
//                        })

public class Watched implements Serializable {
    
     //SessionFactory factory;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movie;

    @Column(name = "MOVIE")
    private String movie;

    @Column(name = "RAITING")
    private Long raiting;

    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "WATCHED")
    private Boolean watched;

    
    @ManyToMany
    private List<Movie> wmovie;
    
  

    public Long getId_movie() {
        return id_movie;
    }

    public void setId_movie(Long id_movie) {
        this.id_movie = id_movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Long getRaiting() {
        return raiting;
    }

    public void setRaiting(Long Raiting) {
        this.raiting = raiting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }
   
//    public void watchedFunction(Watched watched){
//        Session session = factory.openSession();
//        String query = "SET @p0='2'; SET @p1='sdafsdf'; SET @p2='77'; SET @p3='tonowegowno'; SET @p4='1'; SET @p5='2'; CALL `procedure`(@p0, @p1, @p2, @p3, @p4, @p5);";
//        session.beginTransaction();
//       session.;
//        session.getTransaction().commit();
//        session.close();        
//    }
    

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + movie + '\'' +
                ", raiting=" + raiting +
                ", description='" + description + '\'' +
                ", watched=" + watched +
                '}';
    }

}
