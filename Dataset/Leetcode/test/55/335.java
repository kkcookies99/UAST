class Solution {
    public boolean XXX(int[] nums) {
         int reachIndex = 0;
        for(int i = 0;i < nums.length;i++ ){
            if (i> reachIndex){return false;}
            reachIndex = Math.max(reachIndex,i+nums[i]);
        }
        return true;
    }
}


