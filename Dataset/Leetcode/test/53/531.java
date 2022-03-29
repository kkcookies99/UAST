 class Solution {
    public int XXX(int[] nums) {
        return XXXDivideWithBorder(nums, 0, nums.length - 1);
    }

    private int XXXDivideWithBorder(int[] nums, int start, int end) {
        if (start == end) {
            // 只有一个元素，也就是递归的结束情况
            return nums[start];
        }

        // 计算中间值
        int mid = (start + end) / 2;
        int leftMax = XXXDivideWithBorder(nums, start, mid); // 递归左侧
        int rightMax = XXXDivideWithBorder(nums, mid + 1, end); // 递归右侧
        // 计算包含左侧子序列最后一个元素的子序列最大值
        int maxSubLeftSum = Integer.MIN_VALUE;
        int temp1 = 0;
        for (int i = mid; i >= start; i--) {
            temp1 += nums[i];
            maxSubLeftSum = Math.max(temp1, maxSubLeftSum);
        }
        // 计算包含右侧子序列第一个元素的子序列最大值
        int maxSubRightSum = Integer.MIN_VALUE;
        int temp2 = 0;
        for (int i = mid + 1; i <= end; i++) {
            temp2 += nums[i];
            maxSubRightSum = Math.max(temp2, maxSubRightSum);
        }
        // 计算跨中心的子序列的最大值
        int crossMax = maxSubLeftSum + maxSubRightSum;

        // 比较三者，返回最大值
        return Math.max(Math.max(rightMax,leftMax), crossMax);
    }

}

