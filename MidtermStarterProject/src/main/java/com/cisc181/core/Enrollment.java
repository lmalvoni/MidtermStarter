package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}

	public UUID getSectionID(){
		return this.SectionID;
	}

	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}

	public UUID getStudentID(){
		return this.StudentID;
	}
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}

	public UUID getEnrollmentID(){
		return this.EnrollmentID;
	}
	public double getGrade(){
		return this.Grade;
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	private Enrollment(){
		super();
	}
	private Enrollment(UUID StudentID, UUID SectionID){
		super();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}

}

