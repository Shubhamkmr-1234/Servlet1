package test;

public class EmployeeBean {
	private String empName, empId, empLName, empMail, empPhNo, empState, empCountry;

    public EmployeeBean(String empName, String empId, String empLName, String empMail, String empPhNo, String empState, String empCountry) {
        this.empName = empName;
        this.empId = empId;
        this.empLName = empLName;
        this.empMail = empMail;
        this.empPhNo = empPhNo;
        this.empState = empState;
     
        this.empCountry = empCountry;
    }

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpLName() {
		return empLName;
	}

	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpPhNo() {
		return empPhNo;
	}

	public void setEmpPhNo(String empPhNo) {
		this.empPhNo = empPhNo;
	}

	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}


}
