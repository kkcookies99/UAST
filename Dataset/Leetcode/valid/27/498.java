 public int XXX(int[] nums, int val) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[sum++] = nums[i];
            }
        }
        return sum;
    }

