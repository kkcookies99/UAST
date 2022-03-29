 class Solution {
    public boolean XXX(int[] nums) {
        int length = nums.length;
        boolean ans = true;
        //倒序遍历
        //遍历过程中记录当前可以到达最后一个下标的最小下标位置
        //判断从当前位置能否到达上一步记录的最小下标位置（因为从最小下标位置可以达到最后一个下标）
        int min = length - 1;
        for (int i=length-2; i>=0; i--) {
            if (nums[i] < min - i) {
                ans = false; 
            } else {
                ans = true;
                min = i;
            }
        }
        return ans;
    }
}

