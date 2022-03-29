 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(i % 2 != 0) {
                nums[i] = -nums[i];
            }
            sum += nums[i];
        }
        return sum;
    }
}

