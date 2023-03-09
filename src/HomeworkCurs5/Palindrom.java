package HomeworkCurs5;

import java.util.Scanner;

//
//Folosind un FOR scriem un program care verifica daca un cuvant este
//Palindrom.
//
//Un palindrom este un șir de caractere (de obicei cuvinte, fraze sau
//numere) care citit de la stânga la dreapta sau de la dreapta la stânga
//rămâne neschimbat
//
//Ex : radar (daca citim de la final , tot acelasi inteles are)

public class Palindrom {

	public static void main(String[] args) {
        
        System.out.print("Scrie ceva : ");
        Scanner scrie = new Scanner(System.in);
          
  
        String cuvant = scrie.nextLine();
        int length = cuvant.length();
         
        boolean isPalindrome = true;  
         
        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
          if(cuvant.charAt(beginIndex) != cuvant.charAt(length-1-beginIndex)) {
            System.out.println("Nu avem un palindrom");
            isPalindrome = false;
            break;
          }
        }
          
        if(isPalindrome) {
          System.out.println("Evrika!Palindrom!");
}}}
