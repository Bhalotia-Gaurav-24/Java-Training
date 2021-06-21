package com.pwc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

        public static void main(String[] args) throws SQLException {

            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/training",
                            "root",
                            "rps@12345");


            Statement stmt= con.createStatement();

            stmt.execute("Update customer set address ='Hyderabad' where id = 101");

        }
    }

