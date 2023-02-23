package Curs2;

public class SalaryCalculator {
	
	int hoursWorked = 40;

	public static void main(String[] args) {
		
	Tester tester1 = new Tester();
	tester1.setName("Oana");
	tester1.setRatePerHour(30);
	Tester tester2 = new Tester();
	tester2.setName("Maria");
	tester2.setRatePerHour(25);
	
	System.out.println(tester1.getName());
	System.out.println(tester2.getName());
	
	SalaryCalculator calc = new SalaryCalculator();
	System.out.println("Salariul lui"+ tester1.getName()+"este"+  calc.calculateSalary(tester1.setRatePerHour(0)));

	}
	
	public int calculateSalary(int plataPeOra) {
		int salary = plataPeOra * hoursWorked;
		return salary;
		
	}

}
