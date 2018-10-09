package string1;
/*
https://codingbat.com/prob/p151359

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/

public class WithoutX2 {
	public String withoutX2(String str) {
		if(str.length()<1) return str;
		if(str.length()<2 && str.charAt(0)=='x') return "";
		if(str.length()<2 && str.charAt(0)!='x') return str;
		if(str.substring(0,2).equals("xx")) 
			return str.substring(2, str.length());
		if(str.substring(0,2).charAt(0)=='x')
			return str.substring(1, str.length());
		if(str.substring(0,2).charAt(1)=='x')
			return str.substring(0, 1) + str.substring(2,str.length());
		return str;
	}
}
