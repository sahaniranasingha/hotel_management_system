
package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class dbms {
    
    public static Connection c;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/hotel_management";
            String un="root";
            String pw="1234";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "1234");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void iud(String q) throws Exception {
        Statement s = c.createStatement();
        s.executeUpdate(q);
    }

    public static ResultSet search(String q) throws Exception {
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(q);
        return rs;
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
