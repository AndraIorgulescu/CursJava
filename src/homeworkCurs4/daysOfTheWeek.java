package homeworkCurs4;

import java.util.Scanner;

//u Scriem un program care intreaba utilizatorul un numar.
//u Avem un switch care pentru fiecare numar de la 1 la 7 atribuie o
//valoare reprezentand una din zilele saptamanii unei variabile care
//se numeste ziuaSaptamanii.
//u Daca utilizatorul introduce orice numar peste 7 va primi mesajul “Te
//rugam sa introduci un numar intre 1 si 7”
//u Daca a fost introdus un numar valid se va printa : ”ziua saptamanii
//este <ziua aferenta nr introdus>”


public class daysOfTheWeek {
	
	String day;
	int num; 
	 
		
		public void askUser() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter number:");
		}
		
		public void nameTheDay() {
			switch(day) {
			
			case "Monday":
				num = 1;
				System.out.println("Monday");
				break;
			case "Tuesday":
				num = 2;
				System.out.println("Tuesday");
				break;
			case "Wednesday":
				num = 3;
				System.out.println("Wednesday");
				break;
			case "Thursday":
				num = 4;
				System.out.println("Thursday");
				break;
			case "Friday":
				num = 5;
				System.out.println("Friday");
				break;
			case "Saturday":
				num = 6;
				System.out.println("Saturday");
			case "Sunday":
				num = 7;
				System.out.println("Sunday");
				break;
			
				default:
					System.out.println("please enter a number between 1-7");
			
			}

				
				}

			
		}

		
	


