package string2;

/*
https://codingbat.com/prob/p159772

Given a string, does "xyz" appear in the middle of the string? To define 
middle, we'll say that the number of chars to the left and right of the 
"xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("Ax yzBBB") → false
*/
public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		if (str.length() < 3)
			return false;
		if (str.length() % 2 == 0) {
			if (str.substring((str.length() / 2) - 2, (str.length() / 2) + 1).equals("xyz")
					|| str.substring((str.length() / 2) - 1, (str.length() / 2) + 2).equals("xyz")) {
				return true;
			} else {
				return false;
			}
			// for odd length strings, xyz needs to be ecactly in the middle to meet
			// conditions of true
		} else if (str.substring((str.length() / 2) - 1, (str.length() / 2) + 2).equals("xyz")) {
			return true;
		} else {
			return false;
		}
	}
}
