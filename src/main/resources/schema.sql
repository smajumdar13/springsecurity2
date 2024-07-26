CREATE TABLE Post (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content VARCHAR(255) NOT NULL
);

INSERT INTO Post(title, content) VALUES ('Title 1', 'First test title.');
INSERT INTO Post(title, content) VALUES ('Title 2', 'Second test title.');
INSERT INTO Post(title, content) VALUES ('Title 3', 'Third test title.');