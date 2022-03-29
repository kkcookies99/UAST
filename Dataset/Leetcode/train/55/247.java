class Solution {
    public boolean XXX(int[] nums) {
        int maxJumpIdx = 0; //最大可跳跃位置
        for(int i = 0;i<nums.length-1;i++){
            if(i>maxJumpIdx) return false; //若当前i已是不可到达的，则最后一个位置必不可能到达
            if(maxJumpIdx>=nums.length-1) return true;  //若最后一个位置已在可达范围内
            maxJumpIdx = Math.max(maxJumpIdx, i+nums[i]); //更新最大可达位置
        }
        return maxJumpIdx>=nums.length-1;  
    }
}

