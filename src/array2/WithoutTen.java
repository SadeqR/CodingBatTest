package array2;

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		int[] result = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				result[index] = nums[i];
				index++;
			}
		}
		for(int x=index; x<result.length; x++)
			result[x] = 0;
		return result;
	}
}
