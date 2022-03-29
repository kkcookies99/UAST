 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
                continue;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

