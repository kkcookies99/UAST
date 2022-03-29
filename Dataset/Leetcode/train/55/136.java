    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int[] deque = new int[nums.length];
        int last = 0;
        deque[last]=nums.length-1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= deque[last]) {
                last++;
                deque[last]=i;
            }
        }
        return deque[last]==0;
    }

