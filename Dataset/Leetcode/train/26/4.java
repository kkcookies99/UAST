  public int XXX(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }
        int slow = 0;
        int fast = 1;
        while (true) {
            //fast只要不大于slow就就一直找，注意不要越界
            while (nums[fast] <= nums[slow] && fast + 1 < nums.length) {
                fast++;
            }
            //说明fast找到了最后也没找到
            if (nums[fast] == nums[slow]) {
                return slow + 1;
            } else {
                //fast找到了一个大于slow的值，把slow后面的值替换为fast
                nums[++slow] = nums[fast];
            }
        }
    }

