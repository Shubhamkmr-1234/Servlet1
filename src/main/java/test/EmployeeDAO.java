package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {
	public int register(EmployeeBean eb) {
        int status = 0;
        try {
            Connection con = Connections.getConnections();
            PreparedStatement ps = con.prepareStatement("INSERT INTO emp (EMPLOYEE_NAME, EMPLOYEE_ID, EMPLOYEE_LNAME, EMPLOYEE_MAIL, EMPLOYEE_PHNO, EMPLOYEE_STATE, EMPLOYEE_COUNTRY) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, eb.getEmpName());
            ps.setInt(2, Integer.parseInt(eb.getEmpId()));
            ps.setString(3, eb.getEmpLName());
            ps.setString(4, eb.getEmpMail());
            ps.setString(5, eb.getEmpPhNo());
            ps.setString(6, eb.getEmpState());
            ps.setString(7, eb.getEmpCountry());
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

}
