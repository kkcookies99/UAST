 public int XXX(int[] nums, int target) {
        int min = 1;
        int max = nums.length;
        int i = 0;
        int ret = 0;
        while(i<nums.length) {
            if(target < nums[min-1]) {
                return min-1;
            }
            if(target > nums[max-1]) {
                return max;
            }
            int harf = (min + max) /2 ;
            if(target > nums[harf - 1]) {
                // 大于则在右边
                min = harf + 1;
            }
            else if (target < nums[harf - 1]) {
                max = harf;
            }
            else {
                ret = harf - 1;
                return ret;
            }
            i ++;
        }

        return 0;
    }

