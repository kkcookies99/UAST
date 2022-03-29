 public int XXX(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        for(int j:nums){
            if (j!=val){  
                nums[i]=j;
                i++;
            }
       }
        return i;
    }

