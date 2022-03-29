     public void XXX(int[] nums) {
        int i = 0,  j = nums.length - 1;
        while (i < j) {
            while (i < nums.length && nums[i] == 0) {
                i++;
            }
            while (j >= 0 && nums[j] != 0) {
                j--;
            }
            if (i < j) {
                nums[j] = nums[i];
                nums[i] = 0;
            }
        }
        i = 0; j = nums.length - 1;
        while (i < j) {
            while (j >= 0 && nums[j] == 2) {
                j--;
            }
            while (i < nums.length && nums[i] != 2) {
                i++;
            }
            if (i < j) {
                nums[i] = nums[j];
                nums[j] = 2;
            }
        } 
    }

