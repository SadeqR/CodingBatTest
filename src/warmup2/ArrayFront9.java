package warmup2;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		int length = 0;
		if (nums.length > 4)
			length = 4;
		else
			length = nums.length;
		for (int i = 0; i < length; i++)
			if (nums[i] == 9)
				return true;
		return false;
	}
}
