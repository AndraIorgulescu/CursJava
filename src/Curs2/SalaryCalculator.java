package Curs2;

public class SalaryCalculator {
	
	int hoursWorked = 40;

	public static void main(String[] args) {
		
	Tester tester1 = new Tester();
	tester1.setName("Oana");
	tester1.setRatePerHour(30);
	tester1.SetAge(35);
	
	Tester tester2 = new Tester();
	tester2.setName("Maria");
	tester2.setRatePerHour(25);
	tester2.SetAge(66);
	
	//Tema curs 2
	
	Tester tester3 = new Tester();
	tester3.setName("Zeus");
	tester3.setRatePerHour(23);
	tester3.SetAge(23);
	
	
	System.out.println(tester1.age);
	System.out.println(tester1.getName());
	System.out.println(tester2.getName());
	
	SalaryCalculator calc = new SalaryCalculator();
	System.out.println("Salariul lui "+ tester1.getName() +" este " +  calc.calculateSalary(tester1.getRatePerHour()));
	
	
	//Tema curs2
	
	SalaryCalculator angajat = new SalaryCalculator();
	System.out.println("El este "+ tester3.getName() + " si are " + tester3.age + " ani!");

	}
	
	public int calculateSalary(int plataPeOra) {
		int salary = plataPeOra * hoursWorked;
		return salary;
		
	}

}
