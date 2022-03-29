     public int XXX(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i + 1] >= nums[i] && nums[j - 1] != nums[i]) {
                nums[j++] = nums[i];
            }
            if (i == nums.length - 1 && nums[i - 1] < nums[i] && nums[j - 1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

