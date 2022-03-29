 public int XXX(int[] nums) {
        int len = 0, i = 0, temp;
        for( ; i < nums.length-len-1 ; ) {
            if (nums[i] == nums[i+1]) {
                temp = nums[i];
                int j = i;
                for(;j < nums.length-1 ; j++) {
                    nums[j] = nums[j+1];
                }
                nums[j] = temp;
                len++;
            } else
                i++;
        }
        return nums.length-len;
    }

