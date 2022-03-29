     public int XXX(int[] nums, int val) {
        int n =0;
        for(int i : nums){
            if(i!=val){
                nums[n] = i;
                n++;
            }  
        }
        return n;
    }

