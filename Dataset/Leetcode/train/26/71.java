 class Solution {
    public int XXX(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int cur = nums[0], index = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (cur != nums[i]) {
                cur = nums[i];
                nums[index++] = cur;
            } 
        }
        return index;
    }
}

