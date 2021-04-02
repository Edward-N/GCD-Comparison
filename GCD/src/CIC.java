public class CIC {

	static int count;
	
	// the following are in pairs
	static int highNum1 = 0;  // The First Number with the highest iterations to solve
	static int highNum2 = 0;  // The Second Number with the highest iterations to solve
	static int highGCD = 0;   // The GCD of the Highest iterations for first and second number 
	static int highIter = 0;  // The total number of iterations it took to solve
	
	// The following are in pairs
	static int lowNum1 = 0;   // The First Number with the lowest iterations to solve 
	static int lowNum2 = 0;   // The Second Number with the lowest iterations to solve
	static int lowGCD = 0;    // The GCD of the lowest iterations for first and second number
	static int lowIter = 0;   // The total number of iterations it took to solve
	
	static double totalIterations = 0; // The total number iterations in running all 100 pairs
	static int firstNum = 0;		// The first random number
	static int secondNum = 0;		// The second random number
	static int gcd = 0;				// GCD place holder
	static int index = 0;			// The current index for the for loop

/*	Constructor variables initialized 
 *  
 */
	public CIC(int m, int n, int i) {
		count  = 0;
		firstNum = m;
		secondNum = n;
		index = i;	
		// arguments are passed on the Algo method to find the GCD of the first and second number
		ALGO(firstNum, secondNum, index);
	}
	
	/*
	 * The following method will find the GCD of the first and second number given
	 */
	public void ALGO(int m, int n, int index) {
		int t;
		if (m < n) {
			t = m;
		}
		else {
			 t = n;
		}
		while(t != 0) {
			if( m % t == 0 ) {
				count++;
				if(n % t == 0) {
					count++;
					gcd = t;
					Cal(gcd, index);
					break;
				}
				t = t- 1;
			}
			else t = t - 1;
		}
		gcd = m;
		Cal(gcd, index);
	}
	
	/* 
	 * The following method takes the GCD calculated and compares it with the other GCD to determine
	 * Which GCD had the highest and lowest iterations. The methods as well keeps track of the total iterations
	 */
	public void Cal(int gcd, int i) {
		if(i ==  1) {
			highNum1 = lowNum1 = firstNum;
			highNum2 = lowNum2 = secondNum;
			highGCD = lowGCD = gcd;
			highIter = lowIter = count;
		} else{
			if(highIter < count) {
				highNum1 = firstNum;
				highNum2 = secondNum;
				highGCD = gcd;
				highIter = count;
			}
			if(lowIter > count) {
				lowNum1 = firstNum;
				lowNum2 = secondNum;
				lowGCD = gcd;
				lowIter = count;
			}
		}
			totalIterations+= count;
		}
}
		
