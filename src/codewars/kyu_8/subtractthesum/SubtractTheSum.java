package codewars.kyu_8.subtractthesum;

import static java.lang.System.out;
import java.util.*;

/*
Complete the function which get an input number n such that n >= 10 and n < 10000, then:

    Sum all the digits of n.
    Subtract the sum from n, and it is your new n.
    If the new n is in the list below return the associated fruit, otherwise return back to task 1.

Example

n = 325
sum = 3+2+5 = 10
n = 325-10 = 315 (not in the list)
sum = 3+1+5 = 9
n = 315-9 = 306 (not in the list)
sum = 3+0+6 = 9
n =306-9 = 297 (not in the list)
.
.
.
...until you find the first n in the list below.

There is no preloaded code to help you. This is not about coding skills; think before you code

1-kiwi
2-pear
3-kiwi
4-banana
5-melon
6-banana
7-melon
8-pineapple
9-apple
10-pineapple
11-cucumber
12-pineapple
13-cucumber
14-orange
15-grape
16-orange
17-grape
18-apple
19-grape
20-cherry
21-pear
22-cherry
23-pear
24-kiwi
25-banana
26-kiwi
27-apple
28-melon
29-banana
30-melon
31-pineapple
32-melon
33-pineapple
34-cucumber
35-orange
36-apple
37-orange
38-grape
39-orange
40-grape
41-cherry
42-pear
43-cherry
44-pear
45-apple
46-pear
47-kiwi
48-banana
49-kiwi
50-banana
51-melon
52-pineapple
53-melon
54-apple
55-cucumber
56-pineapple
57-cucumber
58-orange
59-cucumber
60-orange
61-grape
62-cherry
63-apple
64-cherry
65-pear
66-cherry
67-pear
68-kiwi
69-pear
70-kiwi
71-banana
72-apple
73-banana
74-melon
75-pineapple
76-melon
77-pineapple
78-cucumber
79-pineapple
80-cucumber
81-apple
82-grape
83-orange
84-grape
85-cherry
86-grape
87-cherry
88-pear
89-cherry
90-apple
91-kiwi
92-banana
93-kiwi
94-banana
95-melon
96-banana
97-melon
98-pineapple
99-apple
100-pineapple

*/
public class SubtractTheSum {
	//Creating an empty HashMap
	static HashMap<Integer, String> fruits = new HashMap<Integer, String>();
	static {		
		//Mapping strings values to int codes
		fruits.put(1, "kiwi");
		fruits.put(2, "pear");
		fruits.put(3, "kiwi");
		fruits.put(4, "banana");
		fruits.put(5, "melon");
		fruits.put(6, "banana");
		fruits.put(7, "melon");
		fruits.put(8, "pineapple");
		fruits.put(9, "apple");
		fruits.put(10, "pineapple");
		fruits.put(11, "cucumber");
		fruits.put(12, "pineapple");
		fruits.put(13, "cucumber");
		fruits.put(14, "orange");
		fruits.put(15, "grape");
		fruits.put(16, "orange");
		fruits.put(17, "grape");
		fruits.put(18, "apple");
		fruits.put(19, "grape");
		fruits.put(20, "cherry");
		fruits.put(21, "pear");
		fruits.put(22, "cherry");
		fruits.put(23, "pear");
		fruits.put(24, "kiwi");
		fruits.put(25, "banana");
		fruits.put(26, "kiwi");
		fruits.put(27, "apple");
		fruits.put(28, "melon");
		fruits.put(29, "banana");
		fruits.put(30, "melon");
		fruits.put(31, "pineapple");
		fruits.put(32, "melon");
		fruits.put(33, "pineapple");
		fruits.put(34, "cucumber");
		fruits.put(35, "orange");
		fruits.put(36, "apple");
		fruits.put(37, "orange");
		fruits.put(38, "grape");
		fruits.put(39, "orange");
		fruits.put(40, "grape");
		fruits.put(41, "cherry");
		fruits.put(42, "pear");
		fruits.put(43, "cherry");
		fruits.put(44, "pear");
		fruits.put(45, "apple");
		fruits.put(46, "pear");
		fruits.put(47, "kiwi");
		fruits.put(48, "banana");
		fruits.put(49, "kiwi");
		fruits.put(50, "banana");
		fruits.put(51, "melon");
		fruits.put(52, "pineapple");
		fruits.put(53, "melon");
		fruits.put(54, "apple");
		fruits.put(55, "cucumber");
		fruits.put(56, "pineapple");
		fruits.put(57, "cucumber");
		fruits.put(58, "orange");
		fruits.put(59, "cucumber");
		fruits.put(60, "orange");
		fruits.put(61, "grape");
		fruits.put(62, "cherry");
		fruits.put(63, "apple");
		fruits.put(64, "cherry");
		fruits.put(65, "pear");
		fruits.put(66, "cherry");
		fruits.put(67, "pear");
		fruits.put(68, "kiwi");
		fruits.put(69, "pear");
		fruits.put(70, "kiwi");
		fruits.put(71, "banana");
		fruits.put(72, "apple");
		fruits.put(73, "banana");
		fruits.put(74, "melon");
		fruits.put(75, "pineapple");
		fruits.put(76, "melon");
		fruits.put(77, "pineapple");
		fruits.put(78, "cucumber");
		fruits.put(79, "pineapple");
		fruits.put(80, "cucumber");
		fruits.put(81, "apple");
		fruits.put(82, "grape");
		fruits.put(83, "orange");
		fruits.put(84, "grape");
		fruits.put(85, "cherry");
		fruits.put(86, "grape");
		fruits.put(87, "cherry");
		fruits.put(88, "pear");
		fruits.put(89, "cherry");
		fruits.put(90, "apple");
		fruits.put(91, "kiwi");
		fruits.put(92, "banana");
		fruits.put(93, "kiwi");
		fruits.put(94, "banana");
		fruits.put(95, "melon");
		fruits.put(96, "banana");
		fruits.put(97, "melon");
		fruits.put(98, "pineapple");
		fruits.put(99, "apple");
		fruits.put(100, "pineapple");		
	}
	public static int sum_digits(int n) {		
		int total = 0;
		while( n/10 > 0) {
			total = total + (n % 10);
			n = n/10;
		}
		return total + n;
	}	
	public static String subtractSum (int n) {		
		String name = "";
		if(n > 0 && n <= 100) {		
			for(Map.Entry<Integer, String> i: fruits.entrySet()) {
				if(i.getKey() == n) {
					name = i.getValue();
					break;
				}								
			}
		} else {
			name = subtractSum(n - sum_digits(n));
		}
		return name;
	}
	
	public static void main(String... args) {
		/*for(int i = 10; i <= 200; i++) { 
			out.println(i + " -> " + SubtractTheSum.subtractSum(i));
		}*/
		
		out.println("10" + " -> " + SubtractTheSum.subtractSum(10));
		out.println("325" + " -> " + SubtractTheSum.subtractSum(325));
		
	}
}
