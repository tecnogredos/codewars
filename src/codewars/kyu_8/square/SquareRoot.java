package codewars.kyu_8.square;

import static java.lang.System.out;

import java.util.Arrays;

/*
Write a method, that will get an integer array as parameter and will 
process every number from this array.

Return a new array with processing every number of the input-array like 
this:

If the number has an integer square root, take this, otherwise square 
the number.

Example

[4,3,9,7,2,1] -> [2,9,3,49,4,1]

Notes
The input array will always contain only positive numbers, and will 
never be empty or null.

*/
public class SquareRoot {
	
	public static int[] squareOrSquareRoot(int[] array) {
		return Arrays.stream(array).map(
				num -> 
				{
					if(Math.sqrt(num) % 1 == 0) {
						return (int) Math.sqrt(num);
					} else {
						return (num*num);
					}
				}
				).toArray();
	}
	
	public static int[] squareOrSquareRoot_2(int[] array) {
		int[] retorno = new int[array.length];
		double a = 0.0;
		for(int i = 0; i < array.length; i++) {
			a = Math.sqrt(array[i]);
			if(a % 1 == 0) {
				retorno[i] = (int)a;
			} else {
				retorno[i] = (int)Math.pow(array[i], 2);
			}
		}
		return retorno;
	}
	public static void main(String... s) {
		int[] a = new int[] { 4, 3, 9, 7, 2, 1 };
		out.println(Arrays.equals(new int[] { 2, 9, 3, 49, 4, 1 }, SquareRoot.squareOrSquareRoot(a)));

		int[] b = new int[] { 100, 101, 5, 5, 1, 1 };
		out.println(Arrays.equals(new int[] { 10, 10201, 25, 25, 1, 1 }, SquareRoot.squareOrSquareRoot(b)));

		int[] c = new int[] { 1, 2, 3, 4, 5, 6 };
		out.println(Arrays.equals(new int[] { 1, 4, 9, 2, 25, 36 }, SquareRoot.squareOrSquareRoot(c)));

	}
}
