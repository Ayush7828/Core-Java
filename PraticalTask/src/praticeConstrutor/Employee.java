package praticeConstrutor;

public class Employee {
	private int eid;
	private String enmae;
	private double esalary;

	Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.enmae = ename;
		this.esalary = esalary;

	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
}
