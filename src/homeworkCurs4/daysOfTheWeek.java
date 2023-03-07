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
	
	String day ;
	int num; 
	 
		
		public void askUser() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter number:");
			num=scan.nextInt();
		}
		
		public void nameTheDay() {
			switch(num) {
			
			case 1:
				day = "Monday";
				System.out.println("Monday");
				break;
			case 2:
				day = "Tuesday";
				System.out.println("Tuesday");
				break;
			case 3:
				day = "Wednesday";
				System.out.println("Wednesday");
				break;
			case 4:
				day = "Thursday";
				System.out.println("Thursday");
				break;
			case 5:
				day = "Friday";
				System.out.println("Friday");
				break;
			case 6:
				day = "Saturday";
				System.out.println("Saturday");
			case 7:
				day = "Sunday";
				System.out.println("Sunday");
				break;
			
				default:
					System.out.println("please enter a number between 1-7");
			
			}

				
				}

			
		}

		
	


