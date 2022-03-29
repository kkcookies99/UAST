 public void XXX(int[] nums) {
        int oneNum = 0;
        int twoNum = 0;
        int sum = 0;
        int i;
        for(i=0;i< nums.length ;i++){
            sum += nums[i];
            if(nums[i] == 2){
                twoNum += nums[i] ;
            }
        }
        oneNum = sum - twoNum;
        for(i=0 ;i<nums.length - oneNum - twoNum/2;i++){
            nums[i] = 0;
        }
        for(;i<nums.length - twoNum/2;i++){
            nums[i] = 1;
        }
        for( ; i<nums.length ; i++){
            nums[i] = 2;
        }
    }

