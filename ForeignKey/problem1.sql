CREATE TABLE post ( 
id int PRIMARY KEY, 
post varchar(255), 
user_fk int REFERENCES user(id) 
);
