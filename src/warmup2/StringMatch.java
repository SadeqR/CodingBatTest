package warmup2;

public class StringMatch {
	public int stringMatch(String a, String b) {
		String longer = a;
		String smaller = b;
		int count = 0;
		if(a.length()<b.length()) { 
			smaller = a;
			longer = b;
		}
		for(int i=0; i<smaller.length()-1; i++) {
			if(smaller.substring(i, i+2).equals(longer.substring(i,i+2)))
				count++;
		}
		return count;  
	}
}
