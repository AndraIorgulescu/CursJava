

package curs6;

import java.util.Scanner;

public class ConditionalOperator {
	/*
	 * citim 2 numere de la tastaura si verificam urmatoarele:
	 * daca fiecare dintre nr este pozitiv
	 * daca ambele numere sunt pozitive
	 * care dintre cele 2 numere este cel mai mic
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		int num1, num2;
		System.out.println("enter 1st no");
		num1 = scan.nextInt();
		System.out.println("enter 2nd no");
		num2 = scan.nextInt();
		
		//verific daca primul nr. este pozitiv
		if(num1>0) {
			System.out.println("Num1 is +");
		}else{
			System.out.println("Num1 is -");
			
			//result= conditie? expresie1:expresie2
			
			String result = num1>0?"Num1 is +":"Num1 is -";
			System.out.println(result);
			
			if(num2>0) {
				System.out.println("Num2 is +");
			}else{
				System.out.println("Num2 is -");
			
				 result = num2>0?"Num2 is +":"Num2 is -";
				System.out.println(result);
				
				if(num1>0 && num2>0) {
					System.out.println("Both are +");
				}else {
					System.out.println("Both are -");
					
					}
				
				result = (num1>0 && num2>0)?"Both are +":"Both are -";
				System.out.println(result);
				
				if(num1>num2) {
					System.out.println("Num1 >");
					
				}else if (num1==num2) {
					System.out.println("Nums =");
					
					
				}else {
					System.out.println("Num2 >");
				}
				
				result = (num1>num2)?"Num1 >":(num1==num2)?"Nums =":"Num2 >";
				
				}
				
		}
		

	}

}
