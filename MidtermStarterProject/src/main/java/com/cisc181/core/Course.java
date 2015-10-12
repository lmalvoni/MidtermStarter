package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	public String getCourseName(){
		return this.CourseName;
	}
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}

	public int getGradePoints(){
		return this.GradePoints;
	}
	public UUID getCourseID(){
		return this.CourseID;
	}
	public void setCourseID(UUID CourseID){
		this.CourseID= CourseID;
	}
	public eMajor getMajor(){
		return this.Major;
	}
	public void setMajor(eMajor Major){
		this.Major= Major;
	}

}
