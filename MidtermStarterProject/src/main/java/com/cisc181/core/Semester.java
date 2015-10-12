package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}

	public UUID getSemesterID(){
		return this.SemesterID;
	}
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}

	public Date getStartDate(){
		return this.StartDate;
	}
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}

	public Date getEndDate(){
		return this.EndDate;
	}

}