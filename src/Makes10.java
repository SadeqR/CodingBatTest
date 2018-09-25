
public class Makes10 {
	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10) {
			return true;
		}
		if ((a + b) == 10) {
			return true;
		} else {
			return false;
		}
	}
}

/* BETTER SOLUTION:
  	
  	public boolean makes10(int a, int b) {
  		return (a == 10 || b == 10 || a+b == 10);
	}
		
*/
