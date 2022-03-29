 class Solution {
    public int XXX(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast]){
                continue;
            }else {
                nums[slow + 1] = nums[fast];
                slow = slow + 1;
            }
        }

        return slow+1;
    }
}```

