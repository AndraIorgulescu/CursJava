package curs5;

public class StaticVsNonStatic {
	
	 String nume;
	static String departament = "QA";


	public static void main(String[] args) {
		
		StaticVsNonStatic person = new StaticVsNonStatic();
		person.nume="Oana";
		person.departament = "QA";
		System.out.println(person.nume + departament);
		
		System.out.println("------------------------");
		
		StaticVsNonStatic person2 = new StaticVsNonStatic();
		person.nume="Maria";
		person.departament = "HR";
		System.out.println(person2.nume + departament);
		
		System.out.println("------------------------");
		
	//	departament = "DEV";
		StaticVsNonStatic person3 = new StaticVsNonStatic();
		person.nume="Ion";
		person.departament = "Support";
		System.out.println(person3.nume + departament);
		
		System.out.println("------------------------");
		
		System.out.println(person.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);

	}

}
