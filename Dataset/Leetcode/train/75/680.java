 public void XXX(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int left = 0, right = nums.length - 1, index = 0;
        while (index <= right)
            if (nums[index] == 0) {
                swap(nums, left, index);
                index++;
                left++;
            } else if (nums[index] == 2) {
                swap(nums, right, index);
                right--;
            } else
                index++;
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

