    public int XXX(int[] nums) {
        int maxValue = moveWindow(nums);
        return maxValue;
    }

    public int moveWindow(int[] nums){
        if (nums.length==0){
            return 0;
        }

        int maxNums = nums[0];
        int prev = nums[0];
        for(int i=1; i<nums.length; i++){
            // nums[n~i] 与 nums[i] 进行比较
            prev = Math.max(nums[i], prev+nums[i]);
            // maxNums 与 目前维护的子序列进行比较
            maxNums = Math.max(prev, maxNums);
        }
        return maxNums;
}

