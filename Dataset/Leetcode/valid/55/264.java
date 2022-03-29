      public boolean XXX(int[] nums) {
        int n = nums.length - 1;
        int position = n;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] + i >= position) {
                position = i;
            }
        }
        return position == 0;
    }

