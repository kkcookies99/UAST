class Solution {
    public void XXX(int[] nums) {
        int p0 = -1, p1 = -1;
        for(int p2 = 0; p2 < nums.length; p2 ++){
            int tmp = nums[p2];
            if(tmp <= 2) nums[p2] = 2;
            if(tmp <= 1) nums[++p1] = 1;
            if(tmp == 0) nums[++p0] = 0; 
        }
    }
}

