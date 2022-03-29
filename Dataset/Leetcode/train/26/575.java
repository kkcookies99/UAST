     public int XXX(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int cnt = 0;
        int repeat = nums.length;
        for (int i = 1, j = 1; j < nums.length; i++, j++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
                repeat--;
            } else {
                move(nums, i - cnt, cnt);
                i -= cnt;
                cnt = 0;
            }
        }
        return repeat;
    }

    public void move(int[] nums, int index, int cnt) {
        for (int i = index; i + cnt < nums.length; i++) {
            nums[i] = nums[i + cnt];
        }
    }

