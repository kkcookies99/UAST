 public int XXX(int[] nums) {
        int len = 1;
        int i = 0;
        int j = 1;
        if(nums.length == 1) {
            return len;
        }
        while(j < nums.length) {
            while(j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            if(j < nums.length && i + 1 < nums.length) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        len = i + 1;
        return len;
    }

