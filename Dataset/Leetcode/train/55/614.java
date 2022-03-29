 class Solution {
    public boolean XXX(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= farthest)
                farthest = Math.max(farthest, nums[i] + i);
            else
                break;
            
        }
        
        return farthest >= nums.length - 1 ? true : false;
    }
}

