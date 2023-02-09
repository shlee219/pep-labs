CREATE TABLE post (
  id SERIAL PRIMARY KEY,
  post VARCHAR(255),
  user_fk INT,
  FOREIGN KEY (user_fk) REFERENCES user(id)
);