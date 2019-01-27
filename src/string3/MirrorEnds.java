package string3;

/*
https://codingbat.com/prob/p139411

Given a string, look for a mirror image (backwards) string at both the 
beginning and end of the given string. In other words, zero or more 
characters at the very begining of the given string, and at the very end 
of the string in reverse order (possibly overlapping). For example, the 
string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
public class MirrorEnds {
	public String mirrorEnds(String string) {
		String result = "";
		String start = "";
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			//reset end
			temp = "";
			start += string.charAt(i);
			for(int j = start.length()-1; j>=0; j--) {
				//reverse start and store in temp
				temp += string.charAt(j);
				//check if start is at end (but reversed)
				if(temp.equals(string.substring(string.length()-1-i, string.length())))
				//return start (non-reversed version of mirror string)
				result = start;
			}
		}
		return result;
	}
}
