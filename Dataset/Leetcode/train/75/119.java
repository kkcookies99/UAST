class Solution {
    public void XXX(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            int left = 0;
            int lt = 0;
            int right = len - 1;
            while (left <= right) {
                int num = nums[left];
                if (num == 0) {
                    nums[left++] = nums[lt];
                    nums[lt++] = num;
                } else if (num == 1) {
                    left++;
                } else { // num == 2
                    nums[left] = nums[right];
                    nums[right--] = num;
                }
            }
        }
    }
}

