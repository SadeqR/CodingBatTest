package string1;

/*
Given a string of odd length, return the string length 3 from its 
middle, so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/

public class MiddleThree {
	public String middleThree(String str) {
		  return str.substring((((str.length()+1)/2)-2), (((str.length()+1)/2)+1));
	}
}
