 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int sum = 0;
        int max = -100000;
        for (int i = 0; i < nums.length; i++) {
            if (sum<0){
                sum = 0;
            }
            sum += nums[i];
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}

