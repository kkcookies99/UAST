    public boolean XXX(int[] nums) {
        int res = 0;
        for (int i = 0; i <= res && i < nums.length; i++) {
            res = Math.max(res, i + nums[i]);

            //可提前判断是否到达终点
        }

        return res >= nums.length - 1;
    }

