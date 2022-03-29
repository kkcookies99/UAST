 class Solution {
    public int XXX(int[] nums) {
        // 快慢指针
        int fastIndex = 1;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[slowIndex] != nums[fastIndex]) {
                nums[++slowIndex] = nums[fastIndex];          
            }
        }
        return slowIndex+1;
    }
}

