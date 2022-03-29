 public int XXX(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
            if (nums[index] == nums[nums.length - 1]) {
                break;
            }
        }
        return index + 1;
    }

