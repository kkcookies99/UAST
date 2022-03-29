class Solution {
    public boolean XXX(int[] nums) {
        int lastStep = nums.length - 1;
        for(int step = lastStep - 1;step >= 0;step--){
            if(nums[step]+step >= lastStep){
                lastStep = step;
            }
        }
        return lastStep == 0;    
    }
}

