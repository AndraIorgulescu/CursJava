package Homework6;

import java.util.Scanner;

public class DiscountPay {

	public static void main(String[] args) {
		
		float totalCost;
		float payment = 0;
		float discount;
		
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      totalCost = scan.nextFloat();
	      
	      if(totalCost>100)
	      {
	         discount = (totalCost*10)/100;
	         payment = totalCost - discount;
	      }
	      else if (totalCost<=100)
	      {
	         discount = (totalCost*5)/100;
	         payment = totalCost - discount;
	        
	      
	    
	      }
	      System.out.println("Payment is: " + payment);
	   }
	}	
	


