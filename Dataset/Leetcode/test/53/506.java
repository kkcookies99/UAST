     public int XXX(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = -2147483648;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                max = temp > max ? temp : max;
            }
        }
        return max;
    }

