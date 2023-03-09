package HomeworkCurs5;
//0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class FibonacciUsingWhileLoop {


     class Fibonacci{
    	 
	 public static void main(String[] args){
		
    	Scanner sc=new Scanner(System.in);
	    System.out.println("enter no");
	
	    int n=sc.nextInt();
	    int first=0,second=1,next;
	
	    System.out.println("Fibonacci: ");
	
	    int i=0;
	    while(i<n){
		
	    if(i<=1)
	    next=i;
	
	    else{
	    next=first+second;
	    first=second;
	    second=next;
	   
	}
	
	System.out.println(next);
	i++;
	
	
	
	
}}}}


