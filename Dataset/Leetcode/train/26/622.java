 class Solution {
    public int XXX(int[] nums) {
        if (nums.length == 0) return 0; 
        int slow = 0;
        int fast = 0;
        int size = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                size++;
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return size;
    }
}

