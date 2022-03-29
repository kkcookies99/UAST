 class Solution {
    public boolean XXX(int[] nums) {
        int right = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0) right = Math.max(i+nums[i], right);
            if(right<=i) return false;
        }
        return true;
    }
}

