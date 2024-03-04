package inheritance;

public class Vehicle {
	private int vid;
	private String vname;

	public void setvid(int vid) {
		this.vid = vid;
	}

	public int getvid() {
		return vid;
	}

	public void setvname(String vname) {
		this.vname = vname;
	}

	public String getvname() {
		return vname;
	}

}

class Car extends Vehicle {

	private int cprice;
	private String cname;

	public void setcprice(int cprice) {
		this.cprice = cprice;
	}

	public int getcprice() {

		return cprice;
	}

	public void setcname(String cname) {
		this.cname = cname;
	}

	public String getccame() {
		return cname;
	}

}