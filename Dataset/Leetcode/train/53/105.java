class Solution {
    public int XXX(int[] nums) {
        int[] maxto = new int[nums.length];
        maxto[0] = nums[0];
        int res = maxto[0];
        for(int i = 1 ; i < maxto.length ; i ++){
            maxto[i] = Math.max(nums[i]+maxto[i-1],nums[i]);
            if(maxto[i] > res)
                res = maxto[i];
        }
        return res;
    }
}

