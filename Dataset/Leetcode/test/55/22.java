class Solution {
    public boolean XXX(int[] nums) {
        if (nums.length == 1) return true;
        // 直接寻找
        int i, m;
        for (i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 0) // 只有0的时候会出现无法向后继续寻找
            {
                for (m = 0; m < i; m++)
                {
                    if (nums[m] + m > i) break;  // 说明能往后移动
                }
                if (m == i) return false;
            }
        }
        return true;
    }
}

