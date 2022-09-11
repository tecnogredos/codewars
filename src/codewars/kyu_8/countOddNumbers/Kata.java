package codewars.kyu_8.countOddNumbers;

import static java.lang.System.out;
/*
Given a number n, return the number of positive odd numbers below n, EASY!
Examples (Input -> Output)

7  -> 3 (because odd numbers below 7 are [1, 3, 5])
15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])

Expect large Inputs!

 */
public class Kata {
	//Visit the solution page for more information.
	//<link>https://ao.ms/how-to-count-odd-numbers-below-n-using-java/</link>
	//The first solution is not efficiently with large numbers,
	//will quickly timeout
	public static int oddCount(int n){
		/*
		int total = 0;
		for(long i = 1; i < n; i++) {
			if(i % 2 == 1) {			//if it is odd
				total = total + 1;		//must sum one
			}			
		}
		return total;
		*/		
		return (int) Math.floor( n/2 );		
	}
	
	public static void main(String... args) {
		out.println("3 == " + Kata.oddCount(7));
		out.println("7 == " + Kata.oddCount(15));
		out.println("7511 == " + Kata.oddCount(15023));
	}
	
}
