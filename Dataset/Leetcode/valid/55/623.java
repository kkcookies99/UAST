 class Solution {
    public boolean XXX(int[] nums) {
        int farest = 0; //表示最远可以跳到的位置
        for(int i = 0;i <= farest && i < nums.length;i++){
            farest = Math.max(farest,i+nums[i]);
        }
        return farest>= (nums.length-1);
    }
}

