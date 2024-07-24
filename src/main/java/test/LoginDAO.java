package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public boolean login(String empId, String empName) {
        boolean status = false;
        try {
            Connection con = Connections.getConnections();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM emp WHERE EMPLOYEE_ID=? AND EMPLOYEE_NAME=?");
            ps.setString(1, empId);
            ps.setString(2, empName);
            ResultSet rs = ps.executeQuery();
            System.out.println("result set"+rs);
            status = rs.next();
            System.out.println("status ="+status);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

}
