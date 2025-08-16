package Hospital_Management;

import java.sql.*;
import java.util.Scanner;

public class LoginService {
    public static boolean login(String username, String password) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM staff WHERE username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next(); // login success if a match is found
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
