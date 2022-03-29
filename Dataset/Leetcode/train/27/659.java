     public int XXX(int[] nums, int val) {

        int i =0, j=0;
        for (i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                continue;
            }
            nums[j++] = nums[i];
        }
        
        return j;
    }

