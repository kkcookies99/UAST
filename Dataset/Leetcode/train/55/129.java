    public boolean XXX(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        
        int pos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= pos) {
                pos = i;
            }
        }
        return pos == 0; 
    }

