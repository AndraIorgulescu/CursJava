package Homework6;


public class Qualification extends Teacher {
	
//	int experience = 10;
//	String course = "Java";
//	String schedule = "Afternoon";
	
	public Qualification(int ExperienceYears,String course,String schedule) {
		setExperienceYears(ExperienceYears);
	    setCourse(course);
	    setSchedule(schedule);

	}
	
	
	public void verify(){
		
		if(getExperienceYears() >3 && getCourse().equals("JAVA") && getSchedule().equals("Afternoon")){
		System.out.println("\"You qualify to teach at this school!”\"");
		}
		else
	{
		System.out.println("You do not qualify to teach at this school!");
		}
		}}
	
		



//u Avem o metoda care se numeste verify si care verifica urmatoarele:
//u Daca xperienceYears sunt mai mari ca 3 si daca course este egal cu
//“Java” si daca schedule este egal cu “Afternoon”
//u Daca toate conditiile sunt indeplinite printeaza mesajul de qualification
//de mai sus.
//u Daca nu printeaza mesajul de necalificare de mai sus.
//Avem a treia clasa care creaza un obiect de tip Qualification si
//executa metoda de verify.