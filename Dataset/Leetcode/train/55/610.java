 class Solution {
    public boolean XXX(int[] nums) {
        int limit=0,i=0;
        while(i<=limit&&i<nums.length){
            limit=Math.max(limit,i+nums[i]);
            if(limit>=nums.length-1) return true;
            i++;
        }
        return false;
    }
}

