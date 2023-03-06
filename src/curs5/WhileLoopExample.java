package curs5;

import java.util.Scanner;

/*
 * Facem un program care calculeaza salariul pe o saptamana (rate/hour + hoursWorked)
 * Intrebam userul cate ore a lucrat
 * calculam doar daca numarul de ore este intre 1 si 40
 * daca nr de ore este invalid il rugam sa mai introduca o data
 */

public class WhileLoopExample {
	
	public static void main(String[] args) {
		int ratePerHour = 15;
		
		System.out.println("Cate ore ai lucrat aceasta saptamana");
		Scanner scan = new Scanner (System.in);
		
		int hoursWorked = scan.nextInt();
		while(hoursWorked < 1 || hoursWorked > 40) {
	
			System.out.println("Nr. invalid de ore");
			System.out.println("Te rog introdu un nr intre 1 si 40");
			hoursWorked = scan.nextInt();
			
//			
//			boolean flag = true;
//			while(flag) {
//				if(hoursWorked < 1 || hoursWorked >40) {
//					System.out.println("Nr invalid de ore");
//					System.out.println("Te rog introdu un numar intre 1 si 40");
//					hoursWorked = scan.nextInt();	
//				}else {
//					flag = false;
				
			
		}
		System.out.println("Salariul este" + hoursWorked * ratePerHour);

}
}
