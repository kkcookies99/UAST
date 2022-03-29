    public int XXX(int[] nums) {
        //我们发现只需要保存上一个数就行了
        int preMax=nums[0];
        int max=preMax;
        for(int i=1; i<nums.length; i++){
            //如果preMax>0那么加上这个数是肯定比原来大的
            preMax=preMax>0? nums[i]+preMax:nums[i];
            max=preMax>max? preMax:max;
        }
        return max;
    }

