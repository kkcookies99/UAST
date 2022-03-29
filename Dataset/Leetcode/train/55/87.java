class Solution {
    public boolean XXX(int[] nums) {
        int maxCan=0;//可以到达的最大下标
        for(int i=0;i<nums.length && maxCan>=i;i++){
            maxCan=Math.max(maxCan,i+nums[i]);
        }
        return maxCan>=nums.length-1;
    }
}

