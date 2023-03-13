package HomeworkCurs6;

import java.util.Scanner;

public class Teacher(String course, int experinceYears, string schedule) {
	
	public String course;
	public int experienceYears;
	public String schedule;
	Boolean qualify;
	

	 
	 Scanner sc = new Scanner (System.in);
	 
	public void preda() {
        if (qualify){
            System.out.println(this.qualify + " se califica");
        }
        else{
            System.out.println(this.qualify + " nu se califica");
        }}
        
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	

}
