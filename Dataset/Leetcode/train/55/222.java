class Solution {
    public boolean XXX(int[] nums) {
        int cover=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i>cover)return false; //如果超出覆盖范围，则不能到达
            if(cover>=nums.length-1)return true; //如果覆盖范围大于最后一个位置，直接返回true
            cover=Math.max(cover,i+nums[i]);
        }
        return true;
    }
}

