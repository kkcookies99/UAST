 public int XXX(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        //前一个值
        int pre = nums[0];
        //给 不重复数组 赋值的位置
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {

            //找到和前一个不相等的第一个值
            if (nums[i] != pre) {
                nums[ans++] = pre;
                pre = nums[i];
            }
        }

        // 处理好最后一个数值
        nums[ans] = pre;

        return ans + 1;
    }

