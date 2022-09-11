package codewars.kyu_8.reducebutgrow;

import static java.lang.System.out;
import java.util.stream.IntStream;

/*
Given a non-empty array of integers, return the result of multiplying 
the values together in order. 
Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/
public class ReduceButGrow {
	
	public static int grow(int[] x){//non-empty array is defined
									//that is why we no check is exists any
		int total = 1;				//cannot be zero because we are multiplying
		for(int i : x) { 			//for each element of array
			total = total * i;		//make the issue
		}
		return total;
    }
	//using InStream
	public static int grow_2(int[] x){
		return IntStream.of(x).reduce(1, (a, b) -> a * b);  
	}
	public static void main(String... args) {
		
		out.println(ReduceButGrow.grow(new int[]{1,2,3}));
		out.println(ReduceButGrow.grow(new int[]{4,1,1,1,4}));
		out.println(ReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
		out.println("<<< === >>>");
		out.println(ReduceButGrow.grow_2(new int[]{1,2,3}));
		out.println(ReduceButGrow.grow_2(new int[]{4,1,1,1,4}));
		out.println(ReduceButGrow.grow_2(new int[]{2,2,2,2,2,2}));
		
	}
	
}