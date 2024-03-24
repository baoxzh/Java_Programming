CREATE TABLE Books (
                       BookID int NOT NULL AUTO_INCREMENT,
                       BookTitle varchar(100) NOT NULL,
                       BookAuthor varchar(30) NOT NULL,
                       BookPages smallint NOT NULL,
                       BookPublishYear year NOT NULL,
                       BookDescription varchar(2048) NOT NULL,
                       BookPrice decimal(8,2) NOT NULL,
                       BookISBN varchar(13) DEFAULT NULL,
                       BookPublisher varchar(100) DEFAULT NULL,
                       PRIMARY KEY (BookID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
