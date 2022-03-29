// 通解扩展
class Solution {
    public int XXX(int[] nums) {   
        return process(nums, 2);
    }
    int process(int[] nums, int k) { // 最多保留k位相同数字
        int slow = 0; // 慢指针从0开始
        for (int fast : nums) { // 快指针遍历整个数组
            // 检查被保留的元素nums[slow−k]是否和当前待检查元素fast相同
            if (slow < k || nums[slow - k] != fast) nums[slow++] = fast;
        }
        return slow; // 从nums[0]到nums[slow−1]的每个元素都不相同
    }
}

