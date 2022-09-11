package codewars.kyu_7.exesandohs;

import static java.lang.System.out;

/**
Check to see if a string has the same amount of 'x's and 'o's. 
The method must return a boolean and be case insensitive. 
The string can contain any char.

Examples input/output:

	ExesAndOhs("ooxx") 	 => true
	ExesAndOhs("ExesAndOhsoxx")  => false
	ExesAndOhs("ooxXm")  => true
	ExesAndOhs("zpzpzpp")=> true // when no 'x' and 'o' is present should return true
	ExesAndOhs("zzoo") 	 => false



*/
public class ExesAndOhs {
	
	public static boolean getExesAndOhs (String str) {
		int x = 0;//store amount all existing 'x' characters inside the string
		int o = 0;//store amount all existing 'o' characters inside the string
		          //For efective comparation must lower o upper case, but one
		for(char c : (str.toLowerCase()).toCharArray()) {
			if(c == 'x') { x++; } 
			if(c == 'o') { o++;	}
		}	
		return (x == o); //principal condition 'x' and 'o' must be the same
	}
	//Muy buena, quito el mismo número de 'o' en la cadena, que si quito el
	//mismo numero de 'x' en la cadena, la longitud debe ser la misma, por tanto
	//hay el mismo número de 'x' que de 'o'
	public static boolean getXO_2(String str) {
		str = str.toLowerCase();
		return str.replace("o","").length() == str.replace("x","").length();
	}
	//Con filter usando stream. A tomar por culo, este es el bueno
	 public static boolean getXO_3(String str) {    
		//como contar el numero de caractares de una cadena
		long x = str.toLowerCase().chars().filter(c -> c == 'x').count();
		long o = str.toLowerCase().chars().filter(c -> c == 'o').count();
        return (x==o);    
	}
	//Usando stream, en lugar de filter, usa map
    static boolean getXO_4(String str) {
        final Integer sum = str.chars()
                .map(ch -> {
                    switch (Character.toLowerCase(ch)) {
                        case 'x':
                            return 1;
                        case 'o':
                            return -1;
                        default:
                            return 0;
                    }
                })
                .sum();
        return sum.equals(0);
    }
	static public void main(String... args) {

      out.println(ExesAndOhs.getExesAndOhs("xxxooo"));
      out.println(ExesAndOhs.getExesAndOhs("xxxXooOo"));
      out.println(ExesAndOhs.getExesAndOhs("xxx23424esdsfvxXXOOooo"));	  
      out.println(ExesAndOhs.getExesAndOhs("xXxxoewrcoOoo"));
      out.println(ExesAndOhs.getExesAndOhs("XxxxooO"));
      out.println(ExesAndOhs.getExesAndOhs("zssddd"));
      out.println(ExesAndOhs.getExesAndOhs("Xxxxertr34"));
	}
}