public int XXX(int[] nums) {
        int sum=0;
        int res=nums[0];
        for(int x:nums){
            sum=Math.max(sum+x,x);
            res=Math.max(res,sum);
        }
        return res;
    }

