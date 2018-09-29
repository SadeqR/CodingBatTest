package warmup1;

public class Close10 {
	public int close10(int a, int b) {
		  int aa;
		  int bb;
		  if(Math.abs(a-10)>Math.abs(b-10)) return b;
		  else if(Math.abs(a-10)<Math.abs(b-10)) return a;
		  else return 0;
		}
}
