 class Solution {
    public boolean XXX(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if (res>=i) res=Math.max(res, i+nums[i]);
            else return false;
        }
        return true;
    }
}

