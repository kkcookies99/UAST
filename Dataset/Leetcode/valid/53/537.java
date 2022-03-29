     public int XXX(int[] nums) {
        int pre=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            pre=Math.max(pre+nums[i],nums[i]);
            max=Math.max(max,pre);
        }
        return max;
    }

