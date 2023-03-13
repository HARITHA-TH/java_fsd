package ust_batch_3.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
   static final String USER = "root";
   static final String PASS = "pass@word1";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE TABLE EMPLOYEE(name varchar(10), age INT, department varchar(10))";
         stmt.executeUpdate(sql);
         System.out.println("table created successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
 
}

