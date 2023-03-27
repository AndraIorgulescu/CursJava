package Homework6;

import java.util.Scanner;

public class Calificative {

	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Introdu un nota :");
	      int nota = sc.nextInt();
	      char calificativ;

	      if(nota>=90){
	    	  calificativ = 'A';
	      }else if(nota>=80 && nota <=90){
	    	  calificativ = 'B';
	      }
	      else {
	    	  calificativ = 'S';
	      }

	      switch(calificativ) {
	         case 'A' :
	            System.out.println("Ai primit : FoarteBine");
	            break;
	         case 'B' :
	            System.out.println("Ai primit : Bine");
	            break;
	         case 'S' :
	            System.out.println("Ai primit : Suficient");
	        
	            break;
	            
	         default :
		         System.out.println("Invalid grade");
	         
	      }
	      System.out.println("Nota ta este " + calificativ);
	   }
	}

//
//u Scriem un program care intreaba utilizatorul un punctaj.
//u Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii
//atribuim FB
//u Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii
//atribuim B
//u Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
//u Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
//u Daca a luat calificativ FB printam : “Ai primit : Bine”
//u Daca a luat calificativ FB printam : “Ai primit : Suficient”