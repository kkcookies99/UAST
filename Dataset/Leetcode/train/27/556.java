     public int XXX(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        int count = 0;
        int index = 0;
        Arrays.sort(nums);
        // val在数组中出现的次数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val)
            {
                count++;
                index = i;
            }  
        }
        int output = nums.length-count;
        if(count==0)
            return output;
        index = index-count+1;
        for (int i = index; i < nums.length; i++) {
            if(i+count<nums.length)
                nums[i] = nums[i+count];
            else break;
        }
            return output;
    }

