 class Solution {
    public int XXX(int[] nums) {
        int slow = 0;
        for(int fast = slow; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}

