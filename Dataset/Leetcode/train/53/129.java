public int XXX(int[] nums) {
		int max = nums[0];
		int sum = 0;
		for(int i = 0; i <nums.length; i++){
			if(sum > 0)
				sum += nums[i];
			else
				sum = nums[i];
			if(max < sum)
				max = sum;
		}
        return max;
    }

