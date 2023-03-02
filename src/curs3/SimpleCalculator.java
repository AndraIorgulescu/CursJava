package curs3;

import java.util.Scanner;

/*
 * Facem un calculator simplu pentru operatiile de baza : + (adunare) *(inmultire) -(scadere) /(impartire)
 * intrebam userul primul numar
 * intrebam userul operatia matematica
 * intrebam userul al doilea numar
 * printam rezultatul "EX: 4+4=8 "
 */

public class SimpleCalculator {
	
	int num1;
	int num2;
	char operation;
	int result;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation:");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the 2nd number:");
		num2 = scan.nextInt();
	}
    
	public void calculator() {
		
		if(operation == '+') {
			result = num1+num2;
			printResult();
		}else if(operation == '-') {
			result = num1-num2;
			printResult();
		}else if(operation == '*' || operation == 'x') { // || operation == 'x' homework3
			result = num1*num2;			
			printResult();
		}else if(operation == '/' || operation == ':') { //|| operation == ':' homework3
			result = num1/num2;

			printResult();
		}	
		
		
		
	}
	public void printResult() {
		System.out.println(num1 + " " + operation + " " + num2 +  "=" + " " + result );
	}
}
