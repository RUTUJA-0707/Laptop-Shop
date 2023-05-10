# Laptop-Shop
E-commerce website developed by using Spring Boot, Hibernate, MySQL, java as a back-end. And for front-end Angular, HTML & CSS ,Typescript.

Download this zip file and extract those folder. Create a MySQL database name "laptop_shop" on MySQL workbench and then import this provided sql file in your databse and run this file.

Now you need to download NodeJs (version - 12.11.1), Angular cli, and MySQL Community (421 MB). aganin download nvm through provided nvm setup.

Now open "laptopshop\laptopshop" directory in eclipse and fine pom.xml file right click this file and run as maven build. Now open "laptopshop\laptopshop-ui" directory in vs code.

In order to run project you need to perform some commands. which i will share in terms of pic of windows powershell.

Now to run the whole project you have type "ng serve" in vs code terminal. at same time you need to run "laptopshop\laptopshop\src\main\java\com\laptopshop\laptop\laptopshopapplication.java" file in eclipse.

Remember to change the MySQL username and password in "application.properties" file which is located at "laptopshop\laptopshop\src\main\resources\application.properties". at first time while running project you need to change "update" to "create" in itsel file "application.properties" and then second time you can do "create" to "update".
