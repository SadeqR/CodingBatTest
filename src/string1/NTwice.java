package string1;

/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/

public class NTwice {
	public String nTwice(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + str.charAt(i);
		}
		for (int i = 0, x = 1; i < n; i++, x++) {
			result = result + str.charAt(str.length()-n-x);
		}
		return result;
	}
}
