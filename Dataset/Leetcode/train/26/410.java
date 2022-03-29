 public int XXX(int[] nums) {
        if (nums.length == 0) return 0;

        int cur = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[cur] != nums[i]) {
                nums[++cur] = nums[i]; 
            }
        }
        return cur+1;
    }

