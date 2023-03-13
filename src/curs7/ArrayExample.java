package curs7;

public class ArrayExample {

	public static void main(String[] args) {
		String[] textArray = new String[5];
		// String [] textArray = {null, null, null, null }
		
		System.out.println(textArray[0]);
		textArray[0]="This ";
		System.out.println(textArray[0]);
		textArray[1]="is ";
		textArray[2]="an ";
		textArray[3]="array";
		
		for(int i=0;i<textArray.length; i++) {
			System.out.println(textArray[i]);
			
			
			for (String element : textArray) {
				System.out.println(textArray[0]);
			}
			
		}
		
		
	}

}
