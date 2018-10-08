package string1;

/*
https://codingbat.com/prob/p151940

Given a string, if the first or last chars are 'x', return the 
string without those 'x' chars, and otherwise return the string 
unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"


*/

public class withoutX {
	public String withoutX(String str) {
		if(str.length()<1) return str;
		if(str.length()<2 && str.charAt(0)=='x') return "";
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')
			return str.substring(1, str.length() - 1);
		if (str.charAt(0) == 'x')
			return str.substring(1, str.length());
		if (str.charAt(str.length() - 1) == 'x')
			return str.substring(0, str.length() - 1);
		return str;
	}

}
