package codewars.kyu_8.reversewords;

import static java.lang.System.out;
import java.util.*;

public class ReverseWords {
	
	public static String reverseWords(String str){
		String result = "";							//save the result to return
        String[] split = str.split(" ", 0);			//the input string as array
		String[] rever = new String[split.length];	//save the array sorted in reverse way
		
		for(int i = 0; i < split.length; i++) {		//loop across the array lo save 
			rever[split.length -1 - i] = split[i];	//into another array with its elements
		}											//sorted in a reverse order
		for(String a: rever) {						//loop across the temporal array with
			result = result + a + " ";				//the reverse elementes to make the 
		}											//string result to return
		return result.trim();						//must trim to clean the last white blank
	}
	//lovely
	public static String reverseWords_2(String str){		
		List<String> words = Arrays.asList(str.split(" "));
		Collections.reverse(words);
		return String.join(" ", words);
	}
		
	public static void main(String... args){
		out.println("eating like I".equals(ReverseWords.reverseWords("I like eating")));
        out.println("flying like I".equals(ReverseWords.reverseWords("I like flying")));
        out.println("nice is world The".equals(ReverseWords.reverseWords("The world is nice")));
		out.println("<<< === >>>");
		out.println("eating like I".equals(ReverseWords.reverseWords_2("I like eating")));
        out.println("flying like I".equals(ReverseWords.reverseWords_2("I like flying")));
        out.println("nice is world The".equals(ReverseWords.reverseWords_2("The world is nice")));
		
	}
}