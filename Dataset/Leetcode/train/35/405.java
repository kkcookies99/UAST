 class Solution {
    public int XXX(int[] nums, int target) {
        int i;
        for(i=0; i < nums.length; i++){
            if(nums[i] >= target)
                break;
        }
        return i;
    }
}

