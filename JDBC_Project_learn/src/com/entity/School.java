package com.entity;

public class School {
	private int scid;
	private String scname;

	public School(int scid, String scname, double scfees, String scadress) {
		super();
		this.scid = scid;
		this.scname = scname;

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

	@Override
	public String toString() {
		return "School [scid=" + scid + ", scname=" + scname + "]";
	}

}
