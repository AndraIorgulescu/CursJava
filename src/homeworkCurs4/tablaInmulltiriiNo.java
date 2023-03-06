package homeworkCurs4;

import java.util.Scanner;

public class tablaInmulltiriiNo {
	
	
	public static void main(String args[]){ 
		int number;	
		int i;
		int result =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number:" );
		number = scan.nextInt();
		
		for(i=1;i<=10;i++) {	
			result=i*10;
			System.out.println("The result of the numbers is: "+number*i); 
			
		}
		
		}

}
