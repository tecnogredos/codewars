package codewars.kyu_6.sumofdigits;

import static java.lang.System.out;

public class SumOfDigits {

	public static int digital_root(int n) {
		int total = 0;
		while( n/10 > 0) {
			total = total + (n % 10);
			n = n/10;
		}
		total = total + n;
		if(total > 9) {
			total = digital_root(total);
		} 
		return total;		
	}
	//Esta solucion esta mejor
	public static int digital_root_2(int n) {
		while(n > 9){
			n = n/10 + n % 10;
		}
		return(n);
	}
	//Impresionante
	public static int digital_root_3(int n) {
		return (1 + (n - 1) % 9);
	}
	public static int digital_root_4(int n) {
		return n < 10 ? n : digital_root(digital_root(n/10)+n%10);
	}

	public static void main(String... args) {
		out.println("[  16 ] (" + SumOfDigits.digital_root(16) + " = 7)");
		out.println("[ 456 ] (" + SumOfDigits.digital_root(456) + " = 6)");
		out.println("[ 942 ] (" + SumOfDigits.digital_root(942) + " = 6)");
		out.println("[ 132189 ] (" + SumOfDigits.digital_root(132189) + " = 6)");
		out.println("[ 493193 ] (" + SumOfDigits.digital_root(493193) + " = 2)");
		out.println("<<< ====== >>>");
		out.println("[  16 ] (" + SumOfDigits.digital_root_2(16) + " = 7)");
		out.println("[ 456 ] (" + SumOfDigits.digital_root_2(456) + " = 6)");
		out.println("[ 942 ] (" + SumOfDigits.digital_root_2(942) + " = 6)");
		out.println("[ 132189 ] (" + SumOfDigits.digital_root_2(132189) + " = 6)");
		out.println("[ 493193 ] (" + SumOfDigits.digital_root_2(493193) + " = 2)");
		out.println("<<< ====== >>>");
		out.println("[  16 ] (" + SumOfDigits.digital_root_3(16) + " = 7)");
		out.println("[ 456 ] (" + SumOfDigits.digital_root_3(456) + " = 6)");
		out.println("[ 942 ] (" + SumOfDigits.digital_root_3(942) + " = 6)");
		out.println("[ 132189 ] (" + SumOfDigits.digital_root_3(132189) + " = 6)");
		out.println("[ 493193 ] (" + SumOfDigits.digital_root_3(493193) + " = 2)");
		out.println("<<< ====== >>>");
		out.println("[  16 ] (" + SumOfDigits.digital_root_4(16) + " = 7)");
		out.println("[ 456 ] (" + SumOfDigits.digital_root_4(456) + " = 6)");
		out.println("[ 942 ] (" + SumOfDigits.digital_root_4(942) + " = 6)");
		out.println("[ 132189 ] (" + SumOfDigits.digital_root_4(132189) + " = 6)");
		out.println("[ 493193 ] (" + SumOfDigits.digital_root_4(493193) + " = 2)");
	}
}