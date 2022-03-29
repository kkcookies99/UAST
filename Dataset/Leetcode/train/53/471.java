 class Solution {
    public int XXX(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxsum = Math.max(maxsum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}

