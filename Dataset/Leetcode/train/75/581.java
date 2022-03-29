 class Solution {
    public void XXX(int[] nums) {
        int lt = -1;
        int i = 0;
        int gt = nums.length;
        while(i < gt) {
            if(nums[i] == 1) {
                i ++;
            } else if(nums[i] < 1) {
                swap(nums, i++, ++lt);
            } else {
                swap(nums, i, --gt);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

