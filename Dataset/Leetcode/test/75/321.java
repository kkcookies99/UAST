 public void XXX(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int length = nums.length;
        int st = 0;
        int end = length - 1;
        int index = 0;
        while (index <= end) {
            int value = nums[index];
            if (value == 1) {
                index++;
            } else if (value == 0) {
                nums[index] = nums[st];
                nums[st] = value;
                st++;
                index++;
            } else {
                nums[index] = nums[end];
                nums[end] = value;
                end--;
            }
        }
    }

