 class Solution {
    public int XXX(int[] nums) {
        //考虑nums元素只有一个时，最大和即该元素
        if (nums.length == 1) return nums[0];
        //max赋值常量最小值
        int max = Integer.MIN_VALUE;
        //求和
        int sum = 0;
        //遍历数组元素
        for (int i = 0; i < nums.length; i ++){
            //从元素首位开始求和
            sum += nums[i];
            max = Math.max(max, sum);
            //sum若小于0，则相加一定比之前的数小，则忽略
            if (sum <= 0) sum = 0;
        }
        return max;
    }
}

