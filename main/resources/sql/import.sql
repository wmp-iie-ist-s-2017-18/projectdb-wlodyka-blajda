insert into CATEGORY (id, NAME, FOR_ADULTS) VALUES (null, 'Horror', TRUE );
insert into CATEGORY (id, NAME, FOR_ADULTS) VALUES (null, 'Komedia', FALSE );
insert into CATEGORY (id, NAME, FOR_ADULTS) VALUES (null, 'Scifi', FALSE );
insert into CATEGORY (id, NAME, FOR_ADULTS) VALUES (null, 'Film animowany', FALSE );
insert into CATEGORY (id, NAME, FOR_ADULTS) VALUES (null, 'Dramat', TRUE );

insert into MOVIE (id, TITLE, RELEASE_DATE, LANGUAGE, category_id) VALUES (NULL, 'Alien', sysdate, 'Angielski', 1);
insert into MOVIE (id, TITLE, RELEASE_DATE, LANGUAGE, category_id) VALUES (NULL, 'The Conjuring', sysdate, 'Angielski', 1);
insert into MOVIE (id, TITLE, RELEASE_DATE, LANGUAGE, category_id) VALUES (NULL, 'Chlopaki nie placza… ', sysdate, 'Polski', 2);
insert into MOVIE (id, TITLE, RELEASE_DATE, LANGUAGE, category_id) VALUES (NULL, 'Avengers: Infinity War', sysdate, 'Angielski', 3);
insert into MOVIE (id, TITLE, RELEASE_DATE, LANGUAGE, category_id) VALUES (NULL, 'Dragon ball Z', sysdate, 'Japonski', 4);

