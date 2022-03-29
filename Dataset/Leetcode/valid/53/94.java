public int XXX(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int realMax = nums[0];
        int currMax = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(currMax + nums[i] > nums[i]){
                currMax += nums[i]; 
            }else{
                currMax = nums[i];
            }
            if(currMax > realMax){
                realMax = currMax;
            }
        }
        return realMax;
    }

