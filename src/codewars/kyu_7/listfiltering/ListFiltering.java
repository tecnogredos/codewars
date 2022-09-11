package codewars.kyu_7.listfiltering;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.out;

public class ListFiltering {
	
	public static List<Object> filterList(final List<Object> list) {		
		List<Object> numerList = new ArrayList<Object>();//Create a list to contain all int values		
		for(Object i: list) {				//Go through the list looking for int values
			if(!(i instanceof String)) { 	//Take only if is not a String
				numerList.add(i);
			}
		}		
		return numerList;					//Return our already filtered list
  }
	
	public static void main(String... args) {
		
		//ListFiltering lf = new ListFiltering();
		
		List<Object> l = ListFiltering.filterList(List.of(1, 2, "a", "b", 0, 15));
		for(Object i: l) {
			out.println(i);
		}
		
	}
}