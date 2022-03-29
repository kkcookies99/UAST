 class Solution {
    public int XXX(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (count < nums.length) {
            if (nums[count] != val) {
                nums[index] = nums[count];
                index++;
            }
            count++;
        }
        return index;
    }
}

