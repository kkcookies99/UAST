 public int XXX(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (val == nums[i]) {
                for (int j = i; j < length - 1 - count; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[length - 1 - count] = val;
                count++;
            }
        }
        return length - count;
    }

