 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1){
            return nums[0];
        }
        if(nums[1]-nums[0] != 0){
            return nums[0];
        }
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] - nums[i-1] != 0 && nums[i+1] - nums[i] != 0){
                return nums[i];
            }
        }
        if(nums[nums.length-1] - nums[nums.length - 2] != 0){
            return nums[nums.length-1];
        }
        return -1;
    }
}

