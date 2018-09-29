package warmup1;

public class Max1020 {
	public int max1020(int a, int b) {
		  if(a<b) {
			  int swap = a;
			  a = b;
			  b = swap;
		  }
		  if(a>9 && a <21) return a;
		  else if (b>9 && b<21) return b;
		  else return 0;
	}
}
