 class Solution {
    public int XXX(int[] nums, int target) {
        int flag = 0;
        while(flag < nums.length){
            if(nums[flag] < target){
                flag++;
                continue;
            }
            return flag;
        }
        return flag;
    }
}

