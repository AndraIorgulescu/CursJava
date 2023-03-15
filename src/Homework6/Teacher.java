package Homework6;

import java.util.Scanner;

public class Teacher {
	
	private String course;
	private String ExperienceYears;
	private String schedule;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getExperienceYears() {
		return ExperienceYears;
	}

	public void setExperienceYears(String experienceYears) {
		ExperienceYears = experienceYears;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Teacher(String name, String subject, String course, String ExperienceYears, String schedule){
        this.course = course;
        this.ExperienceYears = ExperienceYears;
        this.schedule = schedule;
    }

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public void qulify() {
		
         Scanner scan = new Scanner (System.in);
		
		Boolean califica = true ;
			
		 if(califica  == true) { 
			System.out.println("Se califica");
		}else{
			System.out.println("Nu se califica");
	
	
}}}
