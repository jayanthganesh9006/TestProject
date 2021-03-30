package javaExercises;

public class RollFor2 {

	public static void main(String[] args) {
		
		
		int numberOfRolls;  
	      numberOfRolls = rollFor(2);
	      System.out.println("It took " + numberOfRolls + " rolls to get snake eyes.");
	   }  
	   
	   
	   public static int rollFor( int N ) {
	       if ( N < 2 || N > 12 )
	          throw new IllegalArgumentException("Impossible total for a pair of dice.");
	       int die1, die2;  
	       int roll;        
	       int rollCt;      
	       rollCt = 0;
	       do {
	          die1 = (int)(Math.random()*6) + 1;
	          die2 = (int)(Math.random()*6) + 1;
	          roll = die1 + die2;
	          rollCt++;
	       } while ( roll != N );
	       return rollCt;

	}

}
