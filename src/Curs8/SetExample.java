package Curs8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		set.add("Rosu");
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.add("verde");
		set.add("Galben");
		set.add("maro");
		
		System.out.println(set.size());
		
		System.out.println(set.contains("Rosu"));

	}

}
