package com.pwc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface JdbcConnectionHelper {
    static Connection getConnection() throws SQLException {


        Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/training",
                        "root",
                        "rps@12345");
        return con;
    }
}
