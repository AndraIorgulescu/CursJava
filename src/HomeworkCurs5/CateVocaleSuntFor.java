package HomeworkCurs5;

//Scriem un program care numara cate vocale contine textul ” Eu invat Java”.
//u Va printa urmatorul mesaj : Vocale: nr de vocale din text
//u Rezolvarea o facem atat cu FOR cat si cu While

public class CateVocaleSuntFor {


			public static void main(String[] args) {
				String s = "Eu invat Java(As vrea eu)";
				s = s.toLowerCase();
				char[] c = s.toCharArray();
				int vocalaVietii=0;
				
				for (int i = 0; i < s.length(); i++) { 
		            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
		                vocalaVietii++; 
				}
		  
			System.out.println("Vowels: " + vocalaVietii);
		    }
		}




