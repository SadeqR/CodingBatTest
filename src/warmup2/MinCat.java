package warmup2;

/*
https://codingbat.com/prob/p105745

Given two strings, append them together (known as "concatenation") and 
return the result. However, if the strings are different lengths, omit
chars from the longer string so it is the same length as the shorter 
string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/

public class MinCat {
	public String minCat(String a, String b) {
		String bigger = "";
		
		//check the bigger string
		if (a.length() > b.length()) bigger = a;
		if (b.length() > a.length())  bigger = b;
		
		//omit characters from larger string depending on which 
		//is bigger
		if(bigger.equals(a))
			return a.substring(a.length()-b.length(), a.length()) + b;
		if(bigger.equals(b))
			return a + b.substring(b.length()-a.length(), b.length());
		
		//if strings are both of same length simply concatenate as is
		return a+b;

	}
}
