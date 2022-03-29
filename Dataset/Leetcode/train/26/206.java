 public int XXX(int[] nums) {
        int i = 0 ;
        for(int j = 0 ; j < nums.length ; j ++ )
            if( j == 0 || nums[j] != nums[j-1])
                nums[i++] = nums[j];
        return i;
    }
