package codewars.kyu_7.creditcardmask;

import static java.lang.System.out;

/**
Usually when you buy something, you're asked whether your credit card number, 
phone number or answer to your most secret question is still correct. However, 
since someone could look over your shoulder, you don't want that shown on your 
screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four 
characters into '#'.

*/
class CreditCardMask {
	
	public static String maskify(String str) {	
		String result = "";	
		for(int i = 0; i < str.length(); i++) {
			result = result + ((i < (str.length() - 4)) ? ("#") : (str.charAt(i)));
		}
        return result;
    }
	public static String maskify_2(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
	public static String maskify_3(String str) {
        return str.length()<=4 ? str : str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4);
    }
		
	public static void main(String[] args) {		
		out.println(CreditCardMask.maskify("4556364607935616"));
        out.println(CreditCardMask.maskify("64607935616"));
        out.println(CreditCardMask.maskify("1"));
        out.println(CreditCardMask.maskify(""));
		out.println(CreditCardMask.maskify_2("4556364607935616"));
        out.println(CreditCardMask.maskify_2("64607935616"));
        out.println(CreditCardMask.maskify_2("1"));
        out.println(CreditCardMask.maskify_2(""));
		out.println(CreditCardMask.maskify_3("4556364607935616"));
        out.println(CreditCardMask.maskify_3("64607935616"));
        out.println(CreditCardMask.maskify_3("1"));
        out.println(CreditCardMask.maskify_3(""));
	}
}