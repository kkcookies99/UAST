 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            counter++;
            if(counter % 2 == 1 && nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}

