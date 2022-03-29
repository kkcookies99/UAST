class Solution {
    public boolean XXX(int[] nums) {
        int length = nums.length;
        int lastCan = length-1;
        for(int i=length-1;i>=0;i--) {
            if(nums[i]+i >= lastCan) {
                lastCan = i;
                if(nums[0] >= lastCan)
                    return true;
            }
        }
        return false;
    }
}

