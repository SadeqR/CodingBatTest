package warmup2;

/*
 *  Given a string, return a version where all the "x" have 
 *  been removed. Except an "x" at the very start or end should 
 *  not be removed.
 *	
 *
 *	stringX("xxHxix") → "xHix"
 *	stringX("abxxxcd") → "abcd"
 *	stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
	public String stringX(String str) {
		String result = "";
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
			str = str.substring(1, str.length() - 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'x') {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}
