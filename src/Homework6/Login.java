package Homework6;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		 String Username;
		    String Password;

		    Password = "1234";
		    Username = "Tester";

		    Scanner input1 = new Scanner(System.in);
		    System.out.println("Enter Username : ");
		    String username = input1.next();

		    Scanner input2 = new Scanner(System.in);
		    System.out.println("Enter Pass");
		    String password = input2.next();

		    if (username.equals(Username) && password.equals(Password)) {

		        System.out.println("Logged in!");
		    }

		    else if (username.equals(Username)) {
		        System.out.println("Wrong Password!");
		    } else if (password.equals(Password)) {
		        System.out.println("Wrong Username!");
		    } else {
		        System.out.println("Really bad Username & Password!");
		    }

		}
	}


