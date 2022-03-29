 class Solution {
    public int singleNumber(int[] nums) {
        return dg(nums, 0, 0);
    }
    public int dg(int []nums, int x, int i){
        return i == nums.length ? x : dg(nums, x ^ nums[i], i+1);
    }
}

