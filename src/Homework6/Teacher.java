package Homework6;

import java.util.Scanner;

public class Teacher {
	
	private String course;
	private int ExperienceYears;
	private String schedule;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getExperienceYears() {
		return ExperienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		ExperienceYears = experienceYears;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Teacher(String course, int ExperienceYears, String schedule){
        this.course = course;
        this.ExperienceYears = ExperienceYears;
        this.schedule = schedule;
    }

	public Teacher() {
		

}}