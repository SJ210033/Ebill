package com.ebill.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class billentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="rollno")
	private int rollno;
	@Column(name = "TotalFees")
	private long totalfees;
	@Column(name = "PaidFees")
	private long paidfees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getTotalfees() {
		return totalfees;
	}
	public void setTotalfees(long totalfees) {
		this.totalfees = totalfees;
	}
	public long getPaidfees() {
		return paidfees;
	}
	public void setPaidfees(long paidfees) {
		this.paidfees = paidfees;
	}
	
	@Override
	public String toString() {
		return "billentity [id=" + id +  ", rollno=" + rollno + 
			   ", totalfees=" + totalfees + ", paidfees=" + paidfees + "]";
	}
}
