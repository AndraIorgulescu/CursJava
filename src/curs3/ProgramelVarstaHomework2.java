package curs3;

import java.util.Scanner;

public class ProgramelVarstaHomework2 {

	public static void main(String[] args) {
		
	
		
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Age,baby?");
		 
		 int age = scan.nextInt();
		 
		 if (age < 18 ) {	
				System.out.println("Ask you parents!");
			
		}else if ( age <= 65 || age == 18 ) {
				System.out.println("Legally!!!");
				
		}else {
				System.out.println("Oldie but Goldie!");
		 

	}

}}
