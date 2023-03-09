package HomeworkCurs5;

public class InReverse {

	public static void main(String[] args) {
		
		int no = 987654;
		int backwards = 0;  
		
		while(no != 0)  
			
		{  
			
		int remainder = no % 10;  
		backwards = backwards * 10 + remainder;  
		no = no/10;  
		}  
		System.out.println("The reverse of the given number is: " + backwards);  
		}  

	}


