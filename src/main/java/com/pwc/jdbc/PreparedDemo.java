package com.pwc.jdbc;

import com.pwc.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreparedDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = JdbcConnectionHelper.getConnection();

        String addressCondition = "Pune";

        //  Statement stmt = con.createStatement();
        PreparedStatement preparedStatement = con.prepareStatement("Select * from customer where address=?");

        preparedStatement.setString(1, addressCondition);
        ResultSet rs = preparedStatement.executeQuery();

        List<Customer> customers= new ArrayList<>();



        boolean rowFound = rs.next();
        //  while(rs.next()) {
        if (rowFound) {
//            String name0 = rs.getString("name");
//            String address0 = rs.getString("address");
//            System.out.println(name0 + " -- " + address0);

            Customer customer0 = new Customer();
            customer0.setId(rs.getInt("id"));
            customer0.setName(rs.getString("name"));
            customer0.setAddress(rs.getString("address"));
            customers.add(customer0);


            while(rs.next()) {
//                String name = rs.getString("name");
//                String address = rs.getString("address");
//                //int id = rs.getInt("id");
//                System.out.println(name + " -- " + address);
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customers.add(customer);
            }
        } else {
            System.out.println("The row with id: " + addressCondition + " not found");
        }
        customers.forEach(System.out::println);
    }
}
