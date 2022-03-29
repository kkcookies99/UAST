class Solution {
    public boolean XXX(int[] nums) {
       return Jump(nums, 0);
    }
    public boolean Jump(int[] nums, int index) {
        if(index >= nums.length - 1) return true;
        int num = nums[index];
        //if(num == 0) return false;
        for(int j = 1; j <= num; j++){
             if(Jump(nums, index + j))
                 return true;
        }
        return false;
    }
}

