package warmup1;

public class StringE {
	public boolean stringE(String str) {
		int counter=0;
		for (int i=0; i<str.length(); i++)
			if(str.charAt(i)=='e') counter++;
		if(counter>0 && counter<4) return true;
		else return false;
	}
}
