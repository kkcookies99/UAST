class Solution {
    public int XXX(int[] nums) {
        if(nums.length == 1)return nums[0];
        int last = nums[0],max = -2000000;
        max = Math.max(max,nums[0]);
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i] = nums[i] + nums[i-1];
            }
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}

