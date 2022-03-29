class Solution {
    public boolean XXX(int[] nums) {
        int last = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; --i) {
            if (i + nums[i] >= last) {
                // 第 i 格可以跳到终点时
                // 将终点视为前方的衔接点 i，去除重复子问题
                // 到达衔接点等价于于到达终点
                last = i;
            } // if (i + nums[i] >= last)
        } // for (int i = nums.length - 2; i >= 0; --i)

        // 如果 last 最终到了 0
        // 说明找到了一条可以到达所有衔接点，最终到达终点的路
        // 0 -> last(n) -> last(n-1) -> ... -> last(1) -> nums.length - 1
        return last == 0;
    } // XXX(int[])
} // Solution Class

