package curs1; // numele pachetului in care se afla clasa

public class FirstClass { // numele pe care l-am dat clasei =>corpul clasei
	
	String nume = "Ioana"; // variabila de instanta, are nevoie de un obiect al clasei pt. a fi utilizata
	
	int varsta = 23;

	public static void main(String[] args) {
		System.out.println("TEST");
		
		FirstClass obiect = new FirstClass();
		
		String prenume = "Ana"; // variabila locala, accesata in interiorul metodei
		
		System.out.println(prenume);
		System.out.println(obiect.nume);

	}
    
}
