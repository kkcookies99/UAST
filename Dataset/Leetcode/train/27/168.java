 class Solution {
    public int XXX(int[] nums, int val) {
        if (nums == null)
            return 0;
        int n = nums.length;
        // 双指针：O(n)
        int start = 0;
        int end = n - 1; // 保证end右侧元素的值都等于val
        while (start <= end && nums[end] == val)
            --end;
        while (start < end) {
            if (nums[start] == val) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                do {
                    --end;
                } while (start < end && nums[end] == val);
            }
            ++start;
        }
        return ++end;   
    }
}

