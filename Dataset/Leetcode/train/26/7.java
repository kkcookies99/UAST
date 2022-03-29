 // 删除有序数组的重复项
class Solution {
    public int XXX(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1; // 删除重复元素之后也至少剩下一个元素
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) { // 说明nums[fast] 和之前的元素都不同
                nums[slow] = nums[fast];        // nums[fast] 的值复制到 nums[slow]
                ++slow;
            }
            ++fast;
        }
        return slow; // 从nums[0]到nums[slow−1]的每个元素都不相同
    }
}

