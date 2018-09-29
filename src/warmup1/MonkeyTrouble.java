package warmup1;

public class MonkeyTrouble {

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && !bSmile) {
			return false;
		} else if (!aSmile && bSmile) {
			return false;
		} else {
			return true;
		}
	}

}
