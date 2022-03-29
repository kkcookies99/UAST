         public int XXX(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int maxConsecutiveSumToThisElem = nums[0];
        int ret = nums[0];
        for (int i = 1; i < len; i++) {
            maxConsecutiveSumToThisElem = Math.max(maxConsecutiveSumToThisElem + nums[i], nums[i]);
            ret = Math.max(ret, maxConsecutiveSumToThisElem);
        }
        return ret;
    }

