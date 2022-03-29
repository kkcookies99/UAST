 class Solution {
    public int XXX(int[] nums, int val) {
        int elementNum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                elementNum++;
                continue;
            }
            nums[i-elementNum] = nums[i];
        }
        return nums.length - elementNum;
    }
}```

