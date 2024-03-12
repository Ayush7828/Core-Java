package arrayProject;

public class Employee {

	private int eid;
	private double eslary;
	private int age;

	public Employee(int eid, double eslary, int age) {

		this.eid = eid;
		this.eslary = eslary;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getEslary() {
		return eslary;
	}

	public void setEslary(double eslary) {
		this.eslary = eslary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
