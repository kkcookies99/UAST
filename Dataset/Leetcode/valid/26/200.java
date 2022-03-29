 public int XXX(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int left = 0;
        int right = 1;
        while (right<nums.length&&nums[right] >= nums[left]) {//保证右指针的值大于左指针
            if (nums[right] != nums[left]) {
                nums[left+1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }

