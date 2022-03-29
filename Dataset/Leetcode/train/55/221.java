class Solution {
    public boolean XXX(int[] nums) {
        int cover=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i>cover)return false; //如果超出覆盖范围，则不能到达
            cover=Math.max(cover,i+nums[i]);
        }
        return true;
    }
}

