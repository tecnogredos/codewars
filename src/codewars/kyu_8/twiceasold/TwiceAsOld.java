package codewars.kyu_8.twiceasold;

import static java.lang.System.out;

/*
Your function takes two arguments:
    current father's age (years)
    current age of his son (years)
Calculate how many years ago the father was twice as old as his son 
(or in how many years he will be twice as old). The answer is always 
greater or equal to 0, no matter if it was in the past or it is in the future.

*/
public class TwiceAsOld {
	
	public static int TwiceAsOld_1(int dadYears, int sonYears){
		int total = 0;
		total = dadYears - 2 * sonYears;
		return (total < 0) ? (-1 * total) : total;
	}
	public static int TwiceAsOld_2(int dadYears, int sonYears){
		return Math.abs(dadYears - sonYears * 2);
	}
	    
	public static void main(String... args) {
		out.println("30 == " + TwiceAsOld.TwiceAsOld_1(30,0));
		out.println("16 == " + TwiceAsOld.TwiceAsOld_1(30,7));
		out.println("15 == " + TwiceAsOld.TwiceAsOld_1(45,30));
		out.println("<<< === >>>");
		out.println("30 == " + TwiceAsOld.TwiceAsOld_2(30,0));
		out.println("16 == " + TwiceAsOld.TwiceAsOld_2(30,7));
		out.println("15 == " + TwiceAsOld.TwiceAsOld_2(45,30));
	}
}