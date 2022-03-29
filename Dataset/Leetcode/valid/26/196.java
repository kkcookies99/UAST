    public int XXX(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return 1;
        }
        int minNum = nums[0];
        int start = 1;
        int replace = 1;
        for (;start < length;start++){
            if (nums[start] > minNum) {
                nums[replace] = nums[start];
                minNum = nums[start];
                replace++;
            }
            else {
                continue;
            }
        }
        return replace;
    }```

