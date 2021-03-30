package javaExercises;

import java.util.Scanner;

public class CapataliseOneString {

	public static void main(String[] args) {
		
		
		 String s1 = "hello string";
	        String lineUpper ;

	        String line;
	        Scanner sc = new Scanner(System.in);  // Create a Scanner object
	        System.out.println("Enter a line of text.");

	        line = sc.nextLine();  // Read user input
	        lineUpper = line.toUpperCase();
	        System.out.println("Upper Case: "+lineUpper);

	    }

		
		

	}

