package curs6;

public class TernaryOperator {

	public static void main(String[] args) {
	
		int a =60;
		int b = 123;
		int x;
		
		if(a>b) {
			x=a;
		}else {
			x = b;
		}
		System.out.println(x);
		
		int y = a>b?a:b;
		
		System.out.println(y);

	}

}
