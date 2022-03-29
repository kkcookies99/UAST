 class Solution {
    public int XXX(int[] nums, int val) {
        int index = 0;
        int temp = 0;
        while (index<=nums.length-1&&temp<=nums.length-1) {
            if (nums[temp]==val) {
                nums[index] = nums[temp];
            }else {
                nums[index] = nums[temp];
                index++;
            }
            temp++;
        }
        return index;
    }
}

