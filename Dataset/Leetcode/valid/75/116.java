public void XXX(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right && nums[left] == 0)
            left ++;
        while (right > left && nums[right] == 2)
            right --;
        for (int i = left; i <= right; i++) {
            if(nums[i] == 2) {
                nums[i] = nums[right];
                nums[right] = 2;
                while (right > left && nums[right] == 2)
                    right --;
            }
            if(nums[i] == 0) {
                nums[i] = nums[left];
                nums[left] = 0;
                left ++;
            }
        }
    }

