package curs7;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();
		
		Deer bambi = new Deer();
		bambi.makeSound();
		
		Lion simba= new Lion();
		simba.makeSound();
		simba.eatMeat();
		
		Animal leu = new Lion();
		leu.makeSound();
		((Lion) leu).eatMeat();
	
		

	}
	
	public static void feedAnimal(Animal object) {
		if (object instanceof Lion) {
			System.out.println("u are getting steak");
		}else if(object instanceof Deer) {
			System.out.println("I like eating grass");
		}
	}

}
