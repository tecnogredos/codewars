package codewars.kyu_7.factorial;


public class Factorial {

	public int factorial(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		} 
		int a = 1;
		if (n >= 1) {
			a = n * factorial(n -1 );
		}
		return a;
	}
	public static void main(String... args) {
	}
}