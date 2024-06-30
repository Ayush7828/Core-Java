package com.entity;

public class School {
	private int scid;
	private String scname;
	private double scfees;
	private String scadress;

	public School(int scid, String scname, double scfees, String scadress) {
		super();
		this.scid = scid;
		this.scname = scname;
		this.scfees = scfees;
		this.scadress = scadress;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getScid() {
		return scid;
	}

	public void setScid(int scid) {
		this.scid = scid;
	}

	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public double getScfees() {
		return scfees;
	}

	public void setScfees(double scfees) {
		this.scfees = scfees;
	}

	public String getScadress() {
		return scadress;
	}

	public void setScadress(String scadress) {
		this.scadress = scadress;
	}

	@Override
	public String toString() {
		return "School [scid=" + scid + ", scname=" + scname + ", scfees=" + scfees + ", scadress=" + scadress + "]";
	}

}
