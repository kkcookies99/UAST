 public void XXX(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for(int i =0 ;i < two; ){
            if(nums[i] == 1)
                i++;
            else if(nums[i] == 2)
                swap(nums,--two,i);
            else 
                swap(nums,++zero,i++);       
        }
    }

