class Solution {
    public void XXX(int[] nums) {
        int[] result;
        if (nums.length < 2) {
            result = nums;
            return;
        }
        int target = 1;
        int less = -1;
        int more = nums.length;
        int index = 0;
        while (index < more) {
            if (nums[index] == target) {
                index++;
            }else if (nums[index] < target) {
                swap(nums,index++,++less);
            }else {
                swap(nums,index,--more);
            }
        }
        result = nums;
    }
    
    private void swap(int[] nums,int i,int j) {
        if (i == j) {
            return;
        }
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[j] ^ nums[i];
    }
}

