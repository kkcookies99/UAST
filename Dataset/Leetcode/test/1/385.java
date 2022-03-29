 class Solution {
 public int[] XXX(int[] nums, int target) {
        //排序集合
        Arrays.sort(nums);
        //定义计算开始下标和结束下标
        int startIndex = 0, endIndex = nums.length - 1;
        //如果下标不相等，则开始匹配，这里不严谨的没做过多验证，主要实现功能
        while (startIndex != endIndex) {
            int sum = nums[startIndex] + nums[endIndex];
            //如果两个数相等，则直接返回
            if (sum == target) {
                return new int[]{startIndex, endIndex};
            } else if (sum > target) {
                //如果总数大于目标数，endIndex-1 再次循环判断，这样集合中有效利用每一个数据，并且不会数据重复利用
                endIndex--;
            } else {
                //同理
                startIndex++;
            }
        }
        return null;
    }
}