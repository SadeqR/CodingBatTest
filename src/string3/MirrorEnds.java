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
		String end = "";
		for (int i = 0; i < string.length(); i++) {
			//reset end
			end = "";
			start += string.charAt(i);
			for(int j = string.length()-1; j>=0; j--) {
				end += string.charAt(j);
				if(end.equals(start));
				result = start;
			}
		}
		return result;
	}
}
