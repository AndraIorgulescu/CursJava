package homeworkCurs4;

import java.util.Scanner;

public class TenNoSum {
	

	char operation;
	int result;
		
	public static void main(String args[]){  
		
	int number;	
	int i;
	int sum=0;
	
	
	for(i=1;i<=10;i++)   { //pt. fiecare i de 0 la 10 executa urmatoarele:
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number:" + i);
		number = scan.nextInt();
		
        sum += number;
	}
	
	System.out.println("The sum of the numbers is: "+sum);  
	
	
	
	
	}
	
	
    
	
	

	
		

	

}
