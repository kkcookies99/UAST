 public int XXX(int[] nums, int val) {
        int i = -1;
        int j = 0;
        int len = 0;
        while(j < nums.length) {
            if(nums[j] != val) {
                nums[i+1] = nums[j];
                i++;
                j++;
                len++;
            } else {
                j++;
            }
        }
        return len;
    }

