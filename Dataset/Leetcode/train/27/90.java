 public int XXX(int[] nums, int val) {
        final int length = nums.length;
        int count = 0;
        int i;
        boolean flag = false; // 用于break
        for (i = 0; i+count < length; i++) {
            while (val == nums[i+count]) {
                count++;
                if (i+count >= length) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            nums[i] = nums[i+count];
        }
        return i;
    }

