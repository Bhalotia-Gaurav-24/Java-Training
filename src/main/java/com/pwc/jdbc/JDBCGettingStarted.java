package com.pwc.jdbc;

import java.sql.*;

public class JDBCGettingStarted {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","rps@12345");

        Statement stmt= con.createStatement();
        ResultSet rs= stmt.executeQuery("select * from customer");

        while(rs.next())
        {
            int id=rs.getInt("id");
            String name= rs.getString("name");
            String address= rs.getString("address");

            System.out.println(id + " -- " + name + " -- " + address );
        }
    }
}
