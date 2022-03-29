class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int target = 1;
        if(len <= 1)    return true;
        for(int cur = len-2; cur >= 0 ; cur--){
            if(nums[cur] >= target){
                if(cur == 0)    return true;
                target = 1;
                continue;
            }
            else{
                target++;
                continue;
            }
        }
        return false;
    }
}

