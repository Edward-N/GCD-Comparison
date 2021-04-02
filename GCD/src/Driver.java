// Import Core Java Packages
import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		final int MAX_NUM = 100; // The number of times to generate random numbers
		int firstNum;   // The first random generated number 
		int secondNum;  // The second random generated number
		
		// The following set of variables are used for the
		// the Consecutive Integer Checking Object
		int highIter = 0; // The total number of iterations it took to solve 
		int highGCD = 0;  // The GCD of the Highest iterations for first and second number 
		int highNum1 = 0; // The First Number with the highest iterations to solve
		int highNum2 = 0; // The Second Number with the highest iterations to solve
		int lowIter = 0;  // The total number of iterations it took to solve
		int lowNum1 = 0;   // The First Number with the lowest iterations to solve 
		int lowNum2 = 0;  // The Second Number with the lowest iterations to solve
		int lowGCD = 0;   // The GCD of the lowest iterations for first and second number
		double totalIterations = 0;  // The total number iterations in running all 100 pairs
		
		// The following set of variables are used for the
		// the Euclids algorithm
		int highIter2 =0; // The total number of iterations it took to solve 
		int highGCD2 = 0; // The GCD of the Highest iterations for first and second number 
		int highNum1_0 = 0; // The First Number with the highest iterations to solve
		int highNum2_0 = 0; // The Second Number with the highest iterations to solve
		int lowIter_0 = 0; // The total number of iterations it took to solve
		int lowNum1_0 = 0; // The First Number with the lowest iterations to solve 
		int lowNum2_0 = 0; // The Second Number with the lowest iterations to solve
		int lowGCD_0 = 0;  // The GCD of the lowest iterations for first and second number
		double totalIterations2 = 0; // The total number iterations in running all 100 pairs
		
		
		
		// Creating a random object to generate numbers
		Random random = new Random();
	
		for(int i = 1; i < MAX_NUM; i++) {
			firstNum = random.nextInt(200000 - 2000) + 2000;
			secondNum = random.nextInt(200000 - 2000) + 2000;
			CIC test = new CIC(firstNum, secondNum, i);  // passing the random numbers, and index to object
			Euclids test1 = new Euclids(firstNum, secondNum, i); // passing the random number, and index to object
			
			// The following are the results for the consecutive integer checking 
			highIter = test.highIter;
			highNum1 = test.highNum1;
			highNum2 = test.highNum2;
			highGCD = test.highGCD;
			lowIter = test.lowIter;
			lowNum1 = test.lowNum1;
			lowNum2 = test.lowNum2;
			lowGCD= test.lowGCD;
			totalIterations = test.totalIterations;
			
			
			// The following are the results for the euclids algorithm
			highIter2 = test1.highIter;
			highNum1_0 = test1.highNum1;
			highNum2_0 = test1.highNum2;
			highGCD2 = test1.highGCD;
		    lowIter_0 = test1.lowIter;
			lowNum1_0 = test1.lowNum1;
			lowNum2_0 = test1.lowNum2;
			lowGCD_0  = test1.lowGCD;
			totalIterations2 = test1.totalIterations;
			
			
		}
		
		// The following print statements are for the Consecutive Integer Checking Algorithm
		System.out.println("The most number of iterations used is " + highIter + " for GCD("  +
				highNum1 + ", " + highNum2 + ") = " + highGCD);
				
		System.out.println("The least number of iterations used is " + lowIter + " for GCD("  +
						lowNum1 + ", " + lowNum2 + ") = " + lowGCD);
				
		System.out.println("The average number of iterations used for all 100 pairs is " +
				 totalIterations/MAX_NUM);
		
		System.out.println();
		
		
		// The following print statements are for the Euclidean Algorithm 
		System.out.println("The most number of iterations used is " + highIter2 + " for GCD("  +
						highNum1_0 + ", " + highNum2_0 + ") = " + highGCD2);
						
		
		System.out.println("The least number of iterations used is " + lowIter_0 + " for GCD("  +
				lowNum1_0 + ", " + lowNum2_0 + ") = " + lowGCD_0);
		
		System.out.println("The average number of iterations used for all 100 pairs is " +
		 totalIterations2/MAX_NUM);
		
	}

}
