package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voterid {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vid;	
	private String voterno;
	private String state;
	private String DOB;
	private String district;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVoterno() {
		return voterno;
	}
	public void setVoterno(String voterno) {
		this.voterno = voterno;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Voterid [vid=" + vid + ", voterno=" + voterno + ", state=" + state + ", DOB=" + DOB + ", district="
				+ district + "]";
	}
	
	
}
