     public int XXX(int[] nums) {
        int c = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[c] != nums[i]) {
                nums[++c] = nums[i];
            }
        }

        return ++c;
    }

