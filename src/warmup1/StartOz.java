package warmup1;

public class StartOz {
	public String startOz(String str) {
		String front = "";
		if(str.length()>=1 && str.startsWith("o")) {
			front = front + "o";
		}
		if(str.length()>=2 && str.charAt(1)=='z') {
			front = front + "z";
		}
		return front;
	}
}
