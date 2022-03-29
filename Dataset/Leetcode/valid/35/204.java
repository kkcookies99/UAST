 class Solution {
    public int XXX(int[] nums, int target) {
        // 预处理
        if (target < nums[0]) return 0;
        if (target > nums[nums.length -1]) return nums.length;
        // i j 保存两边范围的位置
        int i = 0, j = nums.length - 1, mid; 
        while (j - i >= 2) { // 保持 i j 间至少隔1个数
            mid = (i + j) / 2 ;
            if (nums[mid] == target) return mid; // 找到
            if (target < nums[mid]) j = mid;
            if (target > nums[mid]) i = mid;
        }
        // 结果 只有3种情况 要么在两边 要么最右边的
        if (nums[i] == target) return i;
        if (nums[j] == target) return j;
        return j;
    }
}

