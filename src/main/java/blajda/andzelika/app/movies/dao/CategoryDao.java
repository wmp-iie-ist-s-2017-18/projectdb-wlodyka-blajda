package blajda.andzelika.app.movies.dao;

import blajda.andzelika.app.movies.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;

public class CategoryDao {
    SessionFactory factory;

    public CategoryDao(SessionFactory factory) {
        this.factory = factory;
    }

    public void saveCategory(Category category){
        Session session = factory.openSession();
        session.save(category);
        session.close();
    }

    public void deleteCategory(Category category){
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(category);
        transaction.commit();
        session.close();
    }

    public Category getById(Long id){
        Session session = factory.openSession();
        Category category = session.get(Category.class, id);
        session.close();
        return category;
    }

    public Category getByName(String name){
        Session session = factory.openSession();
        Query query = session.createQuery("from Category c where c.name =:name");
        query.setParameter("name", name);
        return (Category) query.getSingleResult();
    }

    public List<Category> getAll(){
        Session session = factory.openSession();
        Query query = session.createQuery("from Category");
        List list = query.getResultList();
        if (list != null) {
            return list;
        } else {
            return Collections.emptyList();
        }
    }
}
