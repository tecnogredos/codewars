package codewars.kyu_8.factor;

import java.util.stream.IntStream;
import static java.lang.System.out;

/**
This function should test if the factor is a factor of base.

Return true if it is a factor or false if it is not.
About factors

Factors are numbers you can multiply together to get another number.

2 and 3 are factors of 6 because: 2 * 3 = 6

    You can find a factor by dividing numbers. If the remainder is 0 then the number is a factor.
    You can use the mod operator (%) in most languages to check for a remainder

For example 2 is not a factor of 7 because: 7 % 2 = 1

Note: base is a non-negative number, factor is a positive number.

*/
public class Grasshopper {
	
	public static boolean checkForFactor(int base, int factor) {		
        return (base % factor == 0);
    }
	//Using IntStream
	public static boolean checkForFactor_1(int base, int factor) {
        return IntStream.of(base, factor).anyMatch(value -> base % factor == 0);
    }
	static public void main(String[] a) {
		out.println("true -> " + Grasshopper.checkForFactor(10, 2));
        out.println("true -> " + Grasshopper.checkForFactor(63, 7));
        out.println("true -> " + Grasshopper.checkForFactor(2450, 5));
        out.println("true -> " + Grasshopper.checkForFactor(24612, 3));
		out.println("<<< === >>>");
		out.println("true -> " + Grasshopper.checkForFactor_1(10, 2));
        out.println("true -> " + Grasshopper.checkForFactor_1(63, 7));
        out.println("true -> " + Grasshopper.checkForFactor_1(2450, 5));
        out.println("true -> " + Grasshopper.checkForFactor_1(24612, 3));
	}
}