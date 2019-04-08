package blajda.andzelika.app.movies.gui;

import blajda.andzelika.app.movies.dao.CategoryDao;
import blajda.andzelika.app.movies.dao.MovieDao;
import blajda.andzelika.app.movies.model.Category;
import blajda.andzelika.app.movies.model.Movie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame {
    private List<Movie> movieList = Collections.emptyList();
    private List<Category> categoryList = Collections.emptyList();

    private CategoryDao categoryDao;
    private MovieDao movieDao;

    

    public MainForm(final CategoryDao categoryDao, MovieDao movieDao) {
        initComponents();
        this.categoryDao = categoryDao;
        this.movieDao = movieDao;
        this.loadAllCategories();
        this.loadAllMovies();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
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
                    .addComponent(jDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCategoryForAdults)
                    .addComponent(jAddCategory)
                    .addComponent(jDeleteCategory)))
        );

        jCategoryForAdults.getAccessibleContext().setAccessibleName("jCategoryForAdults");

        Panels.addTab("Categories", Categories);

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

    private void jCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCategoryNameActionPerformed

    private void jAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddCategoryActionPerformed
        addNewCategory();
    }//GEN-LAST:event_jAddCategoryActionPerformed

    private void jDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteCategoryActionPerformed
        deleteCategory();
    }//GEN-LAST:event_jDeleteCategoryActionPerformed

    private void jAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddMovieActionPerformed
        addNewMovie();
    }//GEN-LAST:event_jAddMovieActionPerformed

    private void jDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteMovieActionPerformed
        deleteMovie();
    }//GEN-LAST:event_jDeleteMovieActionPerformed

    private void jMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMovieTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMovieTitleActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Categories;
    private javax.swing.JPanel Movies;
    private javax.swing.JTabbedPane Panels;
    private javax.swing.JButton jAddCategory;
    private javax.swing.JButton jAddMovie;
    private javax.swing.JCheckBox jCategoryForAdults;
    private javax.swing.JTextField jCategoryName;
    private javax.swing.JTable jCategoryTable;
    private javax.swing.JButton jDeleteCategory;
    private javax.swing.JButton jDeleteMovie;
    private javax.swing.JComboBox jMovieCategory;
    private javax.swing.JTextField jMovieLanguage;
    private javax.swing.JTextField jMovieReleaseDate;
    private javax.swing.JTable jMovieTable;
    private javax.swing.JTextField jMovieTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void loadAllMovies() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Title", "Release date", "Language", "Category"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.movieList = movieDao.getAll();
        for(Movie m: movieList){
            String title = m.getTitle();
            String releaseDate = new SimpleDateFormat("dd/MM/yyyy").format(m.getReleaseDate());
            String language = m.getLanguage();
            String category = m.getCategory().getName();
            model.addRow(new Object[]{title, releaseDate, language, category});
        }
        jMovieTable.setModel(model);
    }
    
    private void loadAllCategories() {
    DefaultComboBoxModel DLM = new DefaultComboBoxModel();
    DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Is for adults"}, 0){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
            }
        };
        this.categoryList = categoryDao.getAll();
        for(Category c: categoryList){
            String name = c.getName();
            String forAdults;
            if(c.getForAdults()){
                forAdults = ">18";
            }else{
                forAdults = "<18";
            }
            DLM.addElement(c.getName());
            model.addRow(new Object[]{name, forAdults});
        }
        jCategoryTable.setModel(model);
        jMovieCategory.setModel(DLM);
    }

    private void addNewCategory(){
        Category category = new Category();
        category.setName(jCategoryName.getText());
        category.setForAdults(jCategoryForAdults.isSelected());
        categoryDao.saveCategory(category);
        jCategoryName.setText("");
        jCategoryForAdults.setSelected(false);
        this.loadAllCategories();
    }
    
    private void addNewMovie(){
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
    
    private void deleteCategory(){
        Integer row = jCategoryTable.getSelectedRow();
        if(row != -1){
            Long id = categoryList.get(row).getId();
            categoryDao.deleteCategory(categoryDao.getById(id));
            loadAllCategories();
        }
    }
    
    private void deleteMovie(){
        Integer row = jMovieTable.getSelectedRow();
        if(row != -1) {
            Long id = movieList.get(row).getId();
            movieDao.deleteCategory(movieDao.getById(id));
            loadAllMovies();
        }
    }
}
