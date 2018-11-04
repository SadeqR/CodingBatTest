package string2;
/*
https://codingbat.com/prob/p136417

Given a string, consider the prefix string made of the first N chars of 
the string. Does that prefix string appear somewhere else in the string? 
Assume that the string is not empty and that N is in the range 
1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
*/
public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		for(int i=n; i<str.length(); i++) {
			if(n+i>str.length()) break;
			//i being starting point (which is n) and n+i being end point of substring
			if(str.substring(0, n).equals(str.substring(i,n+i))) return true;
		}
		return false;
	}
}
