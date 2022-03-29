class Solution {
    public boolean XXX(int[] nums) {
        int end = nums.length -1;
        int current = nums.length -2;
        while(current >= 0){
            if(current + nums[current] >= end){
                end = current;
            }
            current--;
        }
        if(end == 0){
            return true;
        }
        return false;
    }
}

