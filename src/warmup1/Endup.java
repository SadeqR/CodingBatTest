package warmup1;

public class Endup {
	public String endUp(String str) {
	if(str.length()<3) return str.toUpperCase();	
	else {
		int temp = str.length() - 3;
			return str.substring(0, temp) + str.substring(temp,str.length()).toUpperCase();
	}
	}
}
