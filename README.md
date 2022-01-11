#FXPrototype by Mouayad and Zubeir

Requirements: <br>
1. Java 11 or Greater
2. Maven

Steps to run the project: <br> <br>
1. Make sure to have a mysql server instance running on port localhost:3306 <br> <br>
2. Create a database by executing: ``` CREATE DATABASE library;``` <br> <br>
3. Create a table named books by executing: ```CREATE TABLE books ( id int auto_increment, title  varchar(500) null, author varchar(500) null, year int null, pages int null, constraint books_pk unique (id) );``` <br> <br>
4. Run ``mvn clean javafx:run`` in the terminal or run the IndexApplication through your preferred IDE



