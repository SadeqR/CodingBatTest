package string3;
/*
https://codingbat.com/prob/p131516

Given a string, return the longest substring that appears at both the 
beginning and end of the string without overlapping. For example, 
sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/
public class SameEnds {
	public String sameEnds(String string) {
		  String result = "";
		  //Divide by 2 to stop overlapping and +1 to be able to include
		  //the last character on both ends of the string (as the substring
		  //function doesn't return the last character if its index is the 
		  //2nd argument
		  for(int i=0; i<string.length()/2+1; i++) {
			  if(string.substring(0, i).equals(string.substring(string.length()-i, string.length()))) {
				  result = string.substring(0,i);
			  }
		  }
		  return result;
	}
}
