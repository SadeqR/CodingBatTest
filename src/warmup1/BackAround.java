package warmup1;

public class BackAround {
	public String backAround(String str) {
		if (str.length() < 2)
			return str + str + str;
		else
			return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
	}
}