 public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((i - 1 >= 0 && nums[i] == nums[i-1]) || (i + 1 <= nums.length - 1 && nums[i] == nums[i+1])) {
                continue;
            }
            return nums[i];
        }
        return -1; 
    }

