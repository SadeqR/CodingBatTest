package string1;

/*

Given a string of even length, return the first half. So the string 
"WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 
 */

public class FirstHalf {
	public String firstHalf(String str) {
		int halfIndex = str.length()/2;
		return str.substring(0, halfIndex);
	}
}
