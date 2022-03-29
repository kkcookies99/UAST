 class Solution {
    public int XXX(int[] nums, int val) {
        // 思路：将等于 val 的元素全部挪到数组的后边
        // 方法：双指针，左边指针找等于 val 的元素，右边指针找不等于 val 的元素，交换位置
        // 复杂度分析: 最多只遍历一遍数组，O(n)
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[right] == val) {
                right--;
                continue;
            }
            if (nums[left] != val) {
                left++;
                continue;
            }
            // 这时，满足条件 nums[left] == val, nums[right] != val, 交换位置
            swap(nums, left, right);
            left++;
            right--;
        }
        return left;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

