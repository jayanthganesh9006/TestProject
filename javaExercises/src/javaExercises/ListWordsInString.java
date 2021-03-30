package javaExercises;

import java.util.Scanner;

public class ListWordsInString {

	public static void main(String[] args) {
		
		
		
		
		String line;    
	       int i;          
	       char ch;    
	       boolean didCR;  
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Enter a line of text.");
	       System.out.print("? ");
	       line = sc.nextLine();
	       
	       
	       System.out.println();
	       didCR = true;
	       
	       for ( i = 0;  i < line.length();  i++ ) {
	          ch = line.charAt(i);
	          if ( Character.isLetter(ch) ) {
	             System.out.print(ch);
	             didCR = false;
	          }
	          else {
	             if ( didCR == false ) {
	                System.out.println();
	                didCR = true;
	             }
	          }
	       }
	       
	       System.out.println();  

	}

}
