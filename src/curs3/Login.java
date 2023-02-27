package curs3;

import java.util.Scanner;

public class Login {
	
	public void verificaLogin() {
		
		Scanner scan = new Scanner(System.in); // obiect care ne ajuta sa citim de la tastatura(consola)
		
		String username = "test";
		String password = "test123";
		
		System.out.println("Te rog sa introduci username :");
		//variabila user va stoca dupa executie ce am scris de la tastatura
		String user = scan.next();
		System.out.println("Te rog sa introduci parola:");
		String pass = scan.next();
		
		//&& => AND => ambele conditii sunt adevarate
		//|| => OR => o singura conditie este adevarata
		
		//comparam date cu operator, comparam stringuri cu equals
		
		if(user.equals(user) && pass.equals(password)) {
			
			System.out.println("Login sucessfull!");
		} else {
			
			System.out.println("Login failed!");
		}
		
		
		
	}
	
	

}
