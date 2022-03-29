class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        int idx = 0;
        int max = 0;
        while(idx <= max){
            max = Math.max(max, idx + nums[idx]);
            if(max >= nums.length - 1){
                return true;
            }
            idx++;
        }
        return false;
    }
}

