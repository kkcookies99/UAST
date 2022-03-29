 class Solution {
    public int XXX(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for(int num : nums){
            sum += num;
            res = Math.max(res, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return res;
    }
}

