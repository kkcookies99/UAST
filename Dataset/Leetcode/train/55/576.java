 class Solution {
    public boolean XXX(int[] nums) {
        int limit = nums[0];
        for (int i=0; i<=limit; i++){
            limit = Math.max(i + nums[i], limit);
            if(limit >= nums.length-1)
                return true;
        }
        return false;
    }
}

