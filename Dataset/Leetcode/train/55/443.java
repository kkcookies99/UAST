 class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) return true; 
        
        int maxStep = nums[0];
        int curr = 1;

        while (curr <= maxStep) {
            maxStep = Math.max(curr + nums[curr], maxStep);
            curr++;
            if (maxStep >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}

