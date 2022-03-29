 public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }

