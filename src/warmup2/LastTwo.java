package warmup2;

/*

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

*/

public class LastTwo {
	public String lastTwo(String str) {
		//check for strings with 1 or less characters
		if(str.length()<2) return str;
		
		//check for strings with length 2 and swap 2 characters around
		if(str.length()<3) return str.substring(str.length()-1, str.length()) 
				+ str.substring(0, str.length()-1);
		//check for strings of any size large than length of 2
		return str.length()>2 ? str.substring(0, str.length()-2) 
				+ str.substring(str.length()-1, str.length())
				+ str.substring(str.length() -2, str.length()-1 ) : str;			
	}
}
