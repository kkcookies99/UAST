 class Solution {
    public int XXX(int[] nums, int target) {
        int i;
        for(i = 0;i < nums.length; i++){
            if(target <= nums[i]){
                break;
            }
        }
        return i;
    }
}

