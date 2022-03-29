 class Solution {
    public int[] XXX(int[] nums, int target) {
        // key:被减数的差值 value:被减数下标
        Map<Integer, Integer> result = new HashMap<>();
        // 返回结果数组
        int[] number = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // 判断该值是否在map中
            if (result.containsKey(nums[i])) {
                // 如果在，则value就是之前的被减数的下标
                number[0] = result.get(nums[i]);
                number[1] = i;
                break;
            }else{
                // 如果当前值没在map中，则计算当前值与目标值的差值
                int temp = target - nums[i];
                // 将差值与当前值的下标保存map
                result.put(temp, i);
            }
        }
        return number;
    }
}

