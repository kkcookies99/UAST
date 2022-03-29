 class Solution {
    public int XXX(int[] nums) {
        int sum_max = Integer.MIN_VALUE;
        for (int box = 1; box < nums.length + 1; box++) { // 滑动窗口的大小
            for (int i = 0; i < nums.length - box + 1; i++) {  // 滑动窗口开始位置的索引
                int sum = 0;
                for (int j = i; j < i + box; j++) {
                    sum += nums[j];
                }
                if (sum > sum_max) 
                    sum_max = sum;
            }
        }
        return sum_max;
    }
}

