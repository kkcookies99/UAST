class Solution {
    public int XXX(int[] nums) {
        //找规律的方法 忽略了对子序列的寻找比较！
        int thisSum = 0, maxSum = nums[0];
        //当前的子序和thisSum 遍历数组 只要没和没变成负数就一直加下去 否则从使他变成负数的下一个数重新开始累积求和
        //maxSum记录最大子序和 只有当thisSum大于它的时候才会更新值
        for(int num : nums){
            thisSum += num;
            if (thisSum > maxSum){
                maxSum = thisSum;
            }
            if (thisSum < 0){
                //当前和成为负数时,则表明此前序列无法为后面提供最大子序列和,因此必须重新确定序列首项
                thisSum = 0; 
            }
        }
        return maxSum;
    }
}

