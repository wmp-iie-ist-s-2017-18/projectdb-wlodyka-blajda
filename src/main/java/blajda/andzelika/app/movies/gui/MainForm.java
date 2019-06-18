package blajda.andzelika.app.movies.gui;

import blajda.andzelika.app.movies.dao.CategoryDao;
import blajda.andzelika.app.movies.dao.MovieDao;
import blajda.andzelika.app.movies.dao.WatchedDao;
import blajda.andzelika.app.movies.model.Category;
import blajda.andzelika.app.movies.model.Movie;
import blajda.andzelika.app.movies.model.Watched;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import javax.persistence.StoredProcedureQuery;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.RollbackException;
import javax.persistence.StoredProcedureQuery;
import javax.swing.JOptionPane;
import org.hibernate.query.Query;

public class MainForm extends javax.swing.JFrame {

    private List<Movie> movieList = Collections.emptyList();
    private List<Category> categoryList = Collections.emptyList();
    private List<Watched> watchedList = Collections.emptyList();

    private CategoryDao categoryDao;
    private MovieDao movieDao;
    private WatchedDao watchedDao;

    public MainForm(final CategoryDao categoryDao, MovieDao movieDao, WatchedDao watchedDao) {
        initComponents();
        this.categoryDao = categoryDao;
        this.movieDao = movieDao;
        this.watchedDao = watchedDao;
        this.loadAllCategories();
        this.loadAllMovies();
        this.loadAllWatched();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Panels = new javax.swing.JTabbedPane();
        Movies = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jMovieTable = new javax.swing.JTable();
        jMovieTitle = new javax.swing.JTextField();
        jMovieReleaseDate = new javax.swing.JTextField();
        jMovieLanguage = new javax.swing.JTextField();
        jMovieCategory = new javax.swing.JComboBox();
        jAddMovie = new javax.swing.JButton();
        jDeleteMovie = new javax.swing.JButton();
        Categories = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCategoryTable = new javax.swing.JTable();
        jCategoryName = new javax.swing.JTextField();
        jCategoryForAdults = new javax.swing.JCheckBox();
        jAddCategory = new javax.swing.JButton();
        jDeleteCategory = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jWatchedTable = new javax.swing.JTable();
        m1Field1 = new javax.swing.JTextField();
        m2Field1 = new javax.swing.JTextField();
        m3Field1 = new javax.swing.JTextField();
        m4Field1 = new javax.swing.JTextField();
        m5Field1 = new javax.swing.JTextField();
        m6Field1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMovieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jMovieTable);

        jMovieTitle.setText("Title");
        jMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMovieTitleActionPerformed(evt);
            }
        });

        jMovieReleaseDate.setText("Release date (dd/mm/yyyy)");

        jMovieLanguage.setText("Language");
        jMovieLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMovieLanguageActionPerformed(evt);
            }
        });

        jMovieCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jAddMovie.setText("Add");
        jAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddMovieActionPerformed(evt);
            }
        });

        jDeleteMovie.setText("Delete");
        jDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MoviesLayout = new javax.swing.GroupLayout(Movies);
        Movies.setLayout(MoviesLayout);
        MoviesLayout.setHorizontalGroup(
            MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jMovieLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jMovieTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMovieReleaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jMovieCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        MoviesLayout.setVerticalGroup(
            MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviesLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMovieTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMovieReleaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddMovie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MoviesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMovieLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMovieCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeleteMovie)))
        );

        Panels.addTab("Movies", Movies);

        jCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jCategoryTable);

        jCategoryName.setText("category name");
        jCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoryNameActionPerformed(evt);
            }
        });

        jCategoryForAdults.setLabel("For adults");

        jAddCategory.setText("Add");
        jAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddCategoryActionPerformed(evt);
            }
        });

        jDeleteCategory.setText("Delete");
        jDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CategoriesLayout = new javax.swing.GroupLayout(Categories);
        Categories.setLayout(CategoriesLayout);
        CategoriesLayout.setHorizontalGroup(
            CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(CategoriesLayout.createSequentialGroup()
                .addComponent(jCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCategoryForAdults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CategoriesLayout.setVerticalGroup(
            CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCategoryForAdults)
                    .addComponent(jAddCategory)
                    .addComponent(jDeleteCategory)))
        );

        jCategoryForAdults.getAccessibleContext().setAccessibleName("jCategoryForAdults");

        Panels.addTab("Categories", Categories);

        jWatchedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jWatchedTable);

        m1Field1.setText("ID");

        m2Field1.setText("Nazwa filmu");

        m3Field1.setText("Ocena");

        m4Field1.setText("Opis");

        m5Field1.setText("Obejrzany");

        m6Field1.setText("Numer bazie");

        jButton2.setText("Dodaj funkcj¹");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(m1Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m2Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m3Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(m5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m6Field1)
                        .addGap(25, 25, 25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m4Field1)
                .addGap(4, 4, 4)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m1Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m2Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m3Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m5Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m6Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(m4Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        Panels.addTab("Kategoria 3", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panels)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panels)
        );

        Panels.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //       watchedDao.addMovie(movie_id, movie, description, raiting, watched, wmovie_id)
        watchedDao.addMovie(m1Field1.getText(),
            m2Field1.getText(),
            m3Field1.getText(),
            m4Field1.getText(),
            m5Field1.getText(),
            m6Field1.getText());
        loadAllWatched();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteCategoryActionPerformed
        deleteCategory();
    }//GEN-LAST:event_jDeleteCategoryActionPerformed

    private void jAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddCategoryActionPerformed
        addNewCategory();
    }//GEN-LAST:event_jAddCategoryActionPerformed

    private void jCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCategoryNameActionPerformed

    private void jDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteMovieActionPerformed
        deleteMovie();
    }//GEN-LAST:event_jDeleteMovieActionPerformed

    private void jAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddMovieActionPerformed
        addNewMovie();
    }//GEN-LAST:event_jAddMovieActionPerformed

    private void jMovieLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMovieLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMovieLanguageActionPerformed

    private void jMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMovieTitleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Categories;
    private javax.swing.JPanel Movies;
    private javax.swing.JTabbedPane Panels;
    private javax.swing.JButton jAddCategory;
    private javax.swing.JButton jAddMovie;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCategoryForAdults;
    private javax.swing.JTextField jCategoryName;
    private javax.swing.JTable jCategoryTable;
    private javax.swing.JButton jDeleteCategory;
    private javax.swing.JButton jDeleteMovie;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JComboBox jMovieCategory;
    private javax.swing.JTextField jMovieLanguage;
    private javax.swing.JTextField jMovieReleaseDate;
    private javax.swing.JTable jMovieTable;
    private javax.swing.JTextField jMovieTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jWatchedTable;
    private javax.swing.JTextField m1Field1;
    private javax.swing.JTextField m2Field1;
    private javax.swing.JTextField m3Field1;
    private javax.swing.JTextField m4Field1;
    private javax.swing.JTextField m5Field1;
    private javax.swing.JTextField m6Field1;
    // End of variables declaration//GEN-END:variables

    private void loadAllMovies() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Title", "Release date", "Language", "Category"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.movieList = movieDao.getAll();
        for (Movie m : movieList) {
            String title = m.getTitle();
            String releaseDate = new SimpleDateFormat("dd/MM/yyyy").format(m.getReleaseDate());
            String language = m.getLanguage();
            String category = m.getCategory().getName();
            model.addRow(new Object[]{title, releaseDate, language, category});
        }
        jMovieTable.setModel(model);
    }

    private void loadAllWatched() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Movie", "Raiting", "Description", "Watched"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.watchedList = watchedDao.getAll();
        for (Watched w : watchedList) {
            String movie = w.getMovie();
            Long raiting = w.getRaiting(); //SimpleDateFormat("dd/MM/yyyy").format(w.getReleaseDate());
            String description = w.getDescription();
            Boolean watched = w.getWatched();
            model.addRow(new Object[]{movie, raiting, description, watched});
        }
        jWatchedTable.setModel(model);
    }

    private void loadAllCategories() {
        DefaultComboBoxModel DLM = new DefaultComboBoxModel();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Is for adults"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.categoryList = categoryDao.getAll();
        for (Category c : categoryList) {
            String name = c.getName();
            String forAdults;
            if (c.getForAdults()) {
                forAdults = ">18";
            } else {
                forAdults = "<18";
            }
            DLM.addElement(c.getName());
            model.addRow(new Object[]{name, forAdults});
        }
        jCategoryTable.setModel(model);
        jMovieCategory.setModel(DLM);

    }

    private void addNewCategory() {
        Category category = new Category();
        category.setName(jCategoryName.getText());
        category.setForAdults(jCategoryForAdults.isSelected());
        categoryDao.saveCategory(category);
        jCategoryName.setText("");
        jCategoryForAdults.setSelected(false);
        this.loadAllCategories();
    }

//    private void addWatchedWithProcedure(){
//        
//    }
    private void addNewWatched() {
        Watched watched = new Watched();

////        Watched watched = new Watched();
////        try{
////          watchedDao.watchedFunction(watched);  
////        } finally {
////            System.out.print("witam");
////        }
////        
////  
    }

    private void addNewMovie() {
        Movie movie = new Movie();
        movie.setTitle(jMovieTitle.getText());
        movie.setLanguage(jMovieLanguage.getText());
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        try {
            movie.setReleaseDate(dt.parse(jMovieReleaseDate.getText()));
            movie.setCategory(categoryDao.getByName(String.valueOf(jMovieCategory.getSelectedItem())));
            movieDao.saveCategory(movie);
            jMovieTitle.setText("");
            jMovieLanguage.setText("");
            jMovieReleaseDate.setText("");
            loadAllMovies();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Wrong date format!");
        }
    }

    private void deleteCategory() {
        Integer row = jCategoryTable.getSelectedRow();
        if (row != -1) {
            Long id = categoryList.get(row).getId();
            categoryDao.deleteCategory(categoryDao.getById(id));
            loadAllCategories();
        }
    }

    private void deleteMovie() {
        Integer row = jMovieTable.getSelectedRow();
        if (row != -1) {
            Long id = movieList.get(row).getId();
            movieDao.deleteCategory(movieDao.getById(id));
            loadAllMovies();
        }
    }
}
