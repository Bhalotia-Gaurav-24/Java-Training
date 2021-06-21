package com.pwc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcConnectionHelper.getConnection();

        String addressCondition = "Pune";

        //  Statement stmt = con.createStatement();
        PreparedStatement preparedStatement = con.prepareStatement("Select * from customer where address=?");

        preparedStatement.setString(1, addressCondition);
        ResultSet rs = preparedStatement.executeQuery();

        boolean rowFound = rs.next();
        //  while(rs.next()) {
        if (rowFound) {
            String name0 = rs.getString("name");
            String address0 = rs.getString("address");
            // int id = rs.getInt("id");
            System.out.println(name0 + " -- " + address0);

            while(rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                //int id = rs.getInt("id");
                System.out.println(name + " -- " + address);
            }
        } else {
            System.out.println("The row with id: " + addressCondition + " not found");
        }
    }
}
