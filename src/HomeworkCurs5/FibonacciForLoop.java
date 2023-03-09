   package HomeworkCurs5;

   
   //0 1 1 2 3 5 8 13 21 34
   
public class FibonacciForLoop {

	public static void main(String[] args) {
		

		 int no1=0;
		 int no2=1;
		 int no3;
		 int i;
		 int count=10;    
		 System.out.print(no1+" "+no2);
		    
		 for(i=2;i<count;++i)   
		 {    
		  no3=no1+no2;    
		  System.out.print(" "+no3);    
		  no1=no2;    
		  no2=no3;    
	}

}}
