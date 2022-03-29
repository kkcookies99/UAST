 class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int maxz = 0;// 最远跳跃距离
        for(int i = 0; i <= maxz; i++){// 动态调整i的范围
            // i的范围为从0到最远跳跃距离
            maxz = Math.max(maxz, nums[i]+i);
            if(maxz >= len-1){return true;}
        }
        return false;
    }
}

