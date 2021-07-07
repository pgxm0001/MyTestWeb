package com.myTest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionMySQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://106.38.41.181/yanShaMall0904";
        String user = "root";
        String password = "Qweasdzxcokm";
        java.sql.Connection myConnection = DriverManager.getConnection(url, user, password);
        Statement mystatement = myConnection.createStatement();
        ResultSet rs = mystatement.executeQuery("SELECT  user_name FROM  yanShaMall0904.backend_admin");
        while(rs.next()) {
            String fn = rs.getString("user_name");
            System.out.println(fn);

        }
        if (mystatement != null) {
            mystatement.close();
            mystatement = null;
        }
        if (myConnection != null) {
            myConnection.close();
            myConnection = null;
        }
    }
}
