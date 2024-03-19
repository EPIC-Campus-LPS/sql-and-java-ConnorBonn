import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "";
        String user = "root";
        String password = "EPIC_Campus2024";
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "SELECT * FROM nvidia"
            ResultSet rs = myStmt.executeQuery(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}