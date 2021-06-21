package com.pwc.jdbc;


import java.sql.*;

public class SelectStatementDemoWithWhereClause  {
    public static void main(String[] args) throws Exception {


        Connection con = JdbcConnectionHelper.getConnection();

        int id = 101;
      //  Statement stmt = con.createStatement();
        PreparedStatement preparedStatement = con.prepareStatement("Select * from customer where id= ?");

        preparedStatement.setInt(1,id);
        ResultSet rs = preparedStatement.executeQuery();
      //  ResultSet rs = stmt.executeQuery("Select * from customer where id=" + id);
        boolean rowFound = rs.next();
        if (rowFound) {
            String name = rs.getString("name");
            String address = rs.getString("address");
            System.out.println(name + " -- " + address);

        } else {
            System.out.println("The row with id: " + id + " not found");
        }


        }


}
