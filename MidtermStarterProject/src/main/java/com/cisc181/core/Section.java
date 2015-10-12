package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID SemesterID;
	private UUID CourseID;
	private UUID SectionID;
	private int RoomID;

	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}

	public UUID getSectionID(){
		return this.SectionID;
	}

	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}

	public UUID getSemesterID(){
		return this.SemesterID;
	}
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}

	public UUID getCourseID(){
		return this.CourseID;
	}
	public int getRoomID(){
		return this.RoomID;
	}
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
}