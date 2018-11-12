package string2;

/*
https://codingbat.com/prob/p194491

Returns true if for every '*' (star) in the string, if there are chars 
both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
*/
public class SameStarChar {
	public boolean sameStarChar(String str) {
		boolean match = true;
		for (int i = 1; i <= str.length() - 2; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i - 1) == str.charAt(i + 1)) {
					match = true;
				} else {
					match = false;
				}
			}
		}
		return match;
	}
/*	public boolean sameStarChar(String str) {
		for (int i = 1; i <= str.length() - 2; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
*/
}
