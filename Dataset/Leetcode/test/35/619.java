 class Solution {
    public int XXX(int[] nums, int target) {
        for(int i = nums.length-1 ;i >=0 ;i--){
            if(nums[i]<target)
                return ++i;
        }
        return 0;
    }
}

