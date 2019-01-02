package recursion1;
/*
https://codingbat.com/prob/p118230

Given a string, compute recursively a new string where all the 'x' chars 
have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/
public class NoX {
	public String noX(String str) {
		if(str.length()<1) return "";
		if(str.charAt(0)=='x') return noX(str.substring(1, str.length()));
		else return str.charAt(0) + noX(str.substring(1, str.length()));
	}
}
