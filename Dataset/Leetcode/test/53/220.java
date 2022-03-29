class Solution {
    public int XXX(int[] nums) {
        int res = nums[0];
        for(int i=0; i < nums.length ;i++){
            res = Math.max(res,nums[i]);
        }
        if(res<0){
            return res;
        }
        int sum = 0 , maxsum = 0;
        for(int i = 0; i<nums.length ;i++){
            sum += nums[i];
            if(sum > maxsum){
                maxsum = sum;
            }
            else if(sum < 0){
                sum = 0;
            }
        }
        return Math.max(res,maxsum);
    }
}

