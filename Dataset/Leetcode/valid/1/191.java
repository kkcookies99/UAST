 class Solution {
    public int[] XXX(int[] nums, int target) {
        /*
        思路：
        1.创建一个map集合，用于存未匹配中的元素，元素做键，索引做值
        2.循环传入的数组
        3.目标值减去当前值得到差值temp
        4.判断map集合中是否有为temp值的键
            4.1 判断为true:返回键为temp索引与当前值索引的数组
            4.2 判断为false:将当前值作为键，索引为值存入map集合
        5.没有匹配返回空
        */
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

