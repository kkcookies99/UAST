 public int XXX(int[] nums) {
    int max=nums[0],csum=0;
        for (int i=0;i<nums.length;i++){
            csum+=nums[i];
            max=Math.max(max,csum);
            if (csum<0) csum=0;
        }
        return max;
    }

