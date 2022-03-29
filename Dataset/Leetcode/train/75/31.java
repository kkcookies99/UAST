public void XXX(int[] nums) {
        int count0 = 0 , count2 = 0 , count1 = 0;;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) count0++;
            if(nums[i] == 2) count2++;
            if(nums[i] == 1) count1++;
        }
        for(int i = 0 ; i < count0 ; i++){
            nums[i] = 0;
        }
        for(int i = count0 ; i < count0+count1 ; i++){
            nums[i] = 1;
        }
        for(int i = count0+count1;i<nums.length;i++){
            nums[i] = 2;
        }
    }

