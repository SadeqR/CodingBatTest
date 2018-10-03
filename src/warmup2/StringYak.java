package warmup2;

/* 
Suppose the string "yak" is unlucky. Given a string, return a version 
where all the "yak" are removed, but the "a" can be any char. The "yak" 
strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public class StringYak {
	public String stringYak(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i = i + 2; // not i = i + 3 because we do i++ later
			} else {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}
