class Solution {
    public void XXX(int[] nums) {
        int n = nums.length;
        int idx = solve(nums, 0, n - 1, 0); // 最开始在整个区间把 0 移动到最左侧
        solve(nums, idx, n - 1, 1); // 把所有 1 移动到 0 的右侧， 2 的左侧，即在 [idx, n - 1] 内把 1 移动到 2 左侧
    }

    public int solve(int[] nums, int lo, int hi, int target) {
        int idx = lo; // 关键点，不要写成 0 了
        for(int i = lo; i <= hi; ++i) {
            if(nums[i] == target) { // 满足条件，则进行 swap
                swap(nums, i, idx++);
            }
        }
        return idx;
    }

    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

