     public int XXX(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }
        int x = 0, y = nums.length - 1;
        while (x <= y) {
            if (nums[x] == val) {
                if (nums[y] != val) {
                    nums[x] = nums[y];
                    nums[y] = val;
                }
                y--;
            } else {
                x++;
            }
        }
        return y + 1;
    }

