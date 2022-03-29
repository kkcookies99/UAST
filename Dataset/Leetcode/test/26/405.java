 public int XXX(int[] nums) {
        int number = 0;
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        nums[number] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                number++;
                nums[number] = nums[i];
            } else {
                continue;
            }
        }
        return number+1;
    }

