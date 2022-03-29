class Solution {
    public int XXX(int x) {
        if(x > (Math.pow(2, 31) - 1) || x < -Math.pow(2, 31)) {
			return 0;
		}
		
		boolean isNegative = false;
		if(x < 0) {
			x = 0 - x;
			isNegative = true;
		}
		
		// 整数转换为数组
		int[] nums = new int[Integer.toString(x).length()];//计算整数位数
		for(int i = 0; i < nums.length; i++) {
			nums[i] = x/(int)(Math.pow(10, nums.length - i - 1)) % 10;
		}
		//System.out.println(Arrays.toString(nums));
		
		// 数组反转
		for(int i = 0, j = nums.length - 1; i < j; i++,j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
		//System.out.println(Arrays.toString(nums));
		
		// 数组转化为整数
		long result = 0l;
		for(int i = 0; i < nums.length; i++) {
			result += (long)nums[i] * (int)(Math.pow(10, nums.length - i - 1));
		}
		//System.out.println(result);
		if(result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
			return 0;
		}
        
		if(isNegative) {
			result = 0 - result;
		}
		return (int)result;
    }
}

