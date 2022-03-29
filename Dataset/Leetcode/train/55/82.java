class Solution {
    public boolean XXX(int[] nums) {
        int len = nums.length;
        int maxReachIndex = 0;
        //青蛙一步一步向前试探，记下自己理论上可以到达的最远距离
        for(int i = 0; i < len; i++){
            //先看下一句代码
            //当小青蛙伤心的发现自己其实已经在原本没法到达的位置maxReachIndex时，就返回false
            if(i > maxReachIndex) return false;
            //先看这一句代码
            //更新青蛙可以跳跃的最远距离
            maxReachIndex = Math.max(maxReachIndex, i + nums[i]);
            //假如最远到达距离已经大于等于尾部元素下标直接结束返回true
            if(maxReachIndex >= len - 1) return true;
        }
        return true;
    }
}

