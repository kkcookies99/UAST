class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        // 最后一个元素的索引
        int last = nums.length - 1;
        // 用rest表示当前可跳跃的最大步数
        int rest = nums[0];
        int index = 1;
        while (rest > 0) {
            if (rest > last - index) {
                // 如果剩余步数可以直接跳到终点
                return true;
            }
            if (nums[index] >= rest) {
                // 可以跳的更远，重置跳跃次数
                rest = nums[index];
            } else {
                // 无法跳的更远，消耗一次跳跃次数
                rest--;
            }
            index++;
        }
        return false;
    }
}

