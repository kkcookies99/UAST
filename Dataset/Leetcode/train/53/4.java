class Solution {
    public int XXX(int[] nums) {
        int maxNum = nums[0], addNum = 0;
        for (int i = 0; i < nums.length; i++) {
            addNum += nums[i];
            maxNum = Math.max(maxNum, addNum);
            if(addNum < 0)
                addNum = 0;
        }
        return maxNum;
    }
}

