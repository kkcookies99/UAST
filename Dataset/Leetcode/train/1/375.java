 class Solution {
    public int[] XXX(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n + 1 >> 1; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
            if (map.containsKey(target - nums[n - i - 1])) {
                return new int[]{n - i - 1, map.get(target - nums[n - i - 1])};
            } else {
                map.put(nums[n - i - 1], n - i - 1);
            }
        }
        return new int[]{0};
    }
}

