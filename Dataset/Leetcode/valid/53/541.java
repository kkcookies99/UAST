 class Solution {
    public int XXX(int[] nums) {
        return XXX(nums, 0, nums.length - 1);
    }

    private int XXX(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }

        int mid = start - (start - end) / 2;

        // 最大数组在左边（属于子问题，递归）
        int leftMax = XXX(nums, start, mid);
        // 最大数组在右边（属于子问题，递归）
        int rightMax = XXX(nums, mid + 1, end);
        // 最大数组在中间（不属于子问题，单独处理）
        int midMax = midMaxSubArray(nums, start, mid, end);

        return Math.max(midMax, Math.max(leftMax, rightMax));
    }

    private int midMaxSubArray(int[] nums, int start, int mid, int end) {
        int left = nums[mid];
        int lSum = nums[mid];
        for(int i = mid - 1; i >= start; i--) {
            lSum += nums[i];
            left = Math.max(left, lSum);
        }

        int right = nums[mid + 1];
        int rSum = nums[mid + 1];
        for(int i = mid + 2; i <= end; i++) {
            rSum += nums[i];
            right = Math.max(right, rSum);
        }

        return Math.max(left + right, Math.max(left, right));
    }
}

