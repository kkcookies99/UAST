 public int XXX(int[] nums, int val) {

    if (null == nums || nums.length == 0) {
        return 0;
    }
    int len = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[len++] = nums[i];
        }
    }
    return len;
}

