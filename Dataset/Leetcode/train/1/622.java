 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int Dvalue = target - nums[i];
            if (map.containsKey(Dvalue) && map.get(Dvalue) != i) {
                return new int[]{i, map.get(Dvalue)};
            }
            map.remove(nums[i]);//没找到就删除这个点
        }
        throw new RuntimeException();
    }

}

