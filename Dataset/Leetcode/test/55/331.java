public boolean XXX(int[] nums) {
        int n = nums.length;
        if(n == 1) return true;
        int can = nums[0];
        for (int i = 1; i < n; i++){
            if(can - 1 < 0) return false;
            can = Math.max(can - 1, nums[i]);
            if (i + can >= n - 1) return true;
        }
        return false;
    }

