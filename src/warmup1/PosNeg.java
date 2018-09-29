package warmup1;

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		} else {
			if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
				return true;
			} else {
				return false;
			}
		}
	}

}

/*
 * else { return ((a < 0 && b > 0) || (a > 0 && b < 0)); }
 */