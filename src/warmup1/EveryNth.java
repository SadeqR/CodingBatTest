package warmup1;

public class EveryNth {
	public String everyNth(String str, int n) {
		String newStr = "";
		for (int i = 0; i < str.length(); i = i + n)
			newStr = newStr + str.charAt(i);
		return newStr;
	}
}
