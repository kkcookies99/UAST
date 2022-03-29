class Solution {
    public boolean XXX(int[] nums) {
        int start = 0;
        int end = 0;
        while(start <= end){
            end =Math.max(end,start + nums[start]);
            if(end >= nums.length-1){
                return true;
            }
            start++;
        }
        return false;
    }
}