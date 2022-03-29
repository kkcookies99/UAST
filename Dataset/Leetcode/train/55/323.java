class Solution {
    public boolean XXX(int[] nums) {
        // 看看能不能从后往前找到第一个元素
        int end = nums.length - 1;
        int j = end - 1;
        while(j >= 0) {
            if(j + nums[j] >= end) end = j; // 更新尾
            j--;
        }
        return end == 0;
    }
}```

