class Solution {
    public boolean XXX(int[] nums) {
        int l = 0,r = 0,ed = nums.length-1;
        while (l<=r&&r<ed)
        {
            r+=Math.max(nums[l]-r+l,0);
            l++;
        }
        if(r>=ed)
            return true;
        return false;
    }
}

