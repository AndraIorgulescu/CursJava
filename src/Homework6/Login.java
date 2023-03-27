package Homework6;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		int NumarIncercari = 3;
		String username = "TestUser";
		String parola = "1234";
		
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username");
			
			String IncercareUser = sc.next();
			
			System.out.println("Enter Pass");
			
			String IncercareParola = sc.next();
			
			if(IncercareUser.equals(username)&&IncercareParola.equals(parola)) {
				System.out.println("Logged in!");
				
				break;
				
			}else {
				System.out.println("Loggin Error");
			}
			
			
			
			NumarIncercari --;	
		}while(NumarIncercari != 0);
		
		
		
		
		
	}

	}


