package Warmup_1;

public class MixStart {
	public boolean mixStart(String str) {
		if (str.length() < 3)
			return false;
		String front = str.substring(0, 3);
		if (front.substring(1, 3).equals("ix")) {
			return true;
		} else
			return false;
	}
}
