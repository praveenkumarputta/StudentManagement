package com.ssc.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "studentid")
	private int studentId;

	@Column(name = "studentname")
	private String studentName;

	@Column(name = "studentjoiningdate")
	private Date studentJoiningDate;

	@Column(name = "studentclass")
	private String studentClass;

	@Column(name = "studentfee")
	private Double studentFee;

	@Column(name = "studentmarks")
	private int studentMarks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentJoiningDate() {
		return studentJoiningDate;
	}

	public void setStudentJoiningDate(Date studentJoiningDate) {
		this.studentJoiningDate = studentJoiningDate;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Double getStudentFee() {
		return studentFee;
	}

	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentJoiningDate="
				+ studentJoiningDate + ", studentClass=" + studentClass + ", studentFee=" + studentFee
				+ ", studentMarks=" + studentMarks + "]";
	}

}
