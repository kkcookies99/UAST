    public void XXX(int[] nums) {

        int index = 0;
        int left = -1, right = nums.length;

        while (index < right) {

            if (nums[index] == 1) {
                index++;
            } else if (nums[index] == 0) {
                nums[++left] = 0 + (nums[index++] = nums[left]) * 0;
            } else {
                nums[--right] = 2 + (nums[index] = nums[right]) * 0;
            }

        }
        
    }

