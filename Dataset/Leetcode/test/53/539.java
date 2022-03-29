  public int XXX(int[] nums) {
        int res = nums[0],pre = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(pre < 0) pre = nums[i];
            else pre += nums[i];
            res = Math.max(res,pre);
        }
        return res;
    }

