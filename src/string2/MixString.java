package string2;
/*
https://codingbat.com/prob/p125185

Given two strings, a and b, create a bigger string made of the first 
char of a, the first char of b, the second char of a, the second char of 
b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/
public class MixString {
	public String mixString(String a, String b) {
		String result = "";
		String biggest = a;
		String smallest = b;
		if(a.length()<=b.length()) {
			smallest = a;
			biggest = b;
		}
		for(int i=0; i<biggest.length(); i++) {
			if(i<a.length()) result += a.charAt(i);
			if(i<b.length()) result += b.charAt(i);
		}
		return result;
	}
}
