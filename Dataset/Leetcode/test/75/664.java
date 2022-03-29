 class Solution {
    public void XXX(int[] nums) {
        int v = 1;
        int lt = -1;
        int gt = nums.length;
        int i = 0;
        while (i < gt) {
            if (nums[i] < v) {
                swap(nums, i++, ++lt);
            } else if (nums[i] > v) {
                swap(nums, i, --gt);
            } else {
                i++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
}

