package HomeworkCurs5;
import java.util.Scanner;

public class CateVocaleSunt {

	public static void main(String[] args) {
		Scanner introdutext = new Scanner(System.in);
		String str = introdutext.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		
		if (c == 'A' || c == 'E' || c == 'I' || c == '0' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		count++;
		}
		}
		System.out.println(count);
		}
		

	}


