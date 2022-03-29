 class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int maxDist = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxDist >= i && i + nums[i] >= maxDist) {
                maxDist = i + nums[i];
            }
            if (maxDist >= nums.length-1) {
                return true;
            }
        }

        return false;
    }
}

