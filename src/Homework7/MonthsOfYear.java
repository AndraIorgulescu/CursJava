package Homework7;

import java.util.Scanner;

public class MonthsOfYear {

	public static void main(String[] args) {
		int n ; 
		  String [] month = {"Jan","Feb","March","April","May","June","July","August","Sep","Oct","Nov","Dec "}; 
		System.out.println("Enter a number "); 
		Scanner in = new Scanner(System.in); 
		n = in.nextInt(); 
		for(int i = 0; i < n ; ++i) 
		{ 
		      System.out.print(month[i] +"  "); 
		    
		 } 
	

	}

}
