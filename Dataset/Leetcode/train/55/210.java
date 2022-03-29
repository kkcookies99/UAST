class Solution {
    public boolean XXX(int[] nums) {
        if(nums.length == 1) return true;
        int l = nums.length-1;
        for(int i = l; i >= 0;){
            for(int j = i - 1; j >= -1; j--){
                if(j == -1)
                return false;
                if((nums[j] + j) >= i){
                    i = j;
                    if(i == 0)
                    return true;
                    break;
                }
            }
        }
        return false;
    }
}

