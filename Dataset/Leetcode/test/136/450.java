 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
       //两个 两个比较 排除最后一个
        for (; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                if (i == nums.length - 2) {
                    return nums[i + 1];//最后一个落单了 就是它了
                }
                continue;
            } else
                break;
        }
        return nums[i];
    }
}

