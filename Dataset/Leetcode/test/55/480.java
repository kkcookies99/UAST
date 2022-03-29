 class Solution {
    public boolean XXX(int[] nums) {
        int endReachable = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) 
            if (i + nums[i] >= endReachable) endReachable = i;
        return endReachable == 0;
    }
}

