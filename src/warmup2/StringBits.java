package warmup2;

public class StringBits {
	public String stringBits(String str) {
		String result = "";
		if(str.length()<1) return result;
		for(int i = 0; i<str.length(); i=i+2) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
