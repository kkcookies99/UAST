public int XXX(int[] nums) {
        int maxSub = nums[0],preSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            preSum = preSum < 0 ? nums[i] : preSum + nums[i];
            maxSub = Math.max(maxSub, preSum);
        }
        return maxSub;
    }

