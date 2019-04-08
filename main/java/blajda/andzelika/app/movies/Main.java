package blajda.andzelika.app.movies;

import blajda.andzelika.app.movies.config.HibernateConfig;
import blajda.andzelika.app.movies.dao.CategoryDao;
import blajda.andzelika.app.movies.dao.MovieDao;
import blajda.andzelika.app.movies.gui.MainForm;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {         

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                HibernateConfig config = new HibernateConfig();
        
               
                CategoryDao categoryDao = new CategoryDao(config.getSessionFactory());
                MovieDao movieDao = new MovieDao(config.getSessionFactory());
                MainForm form = new MainForm(categoryDao, movieDao);
                form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                form.setMinimumSize(new Dimension(640, 480));
                form.setResizable(false);
                form.pack();
                form.setVisible(true);
            }
        });
    }
}
