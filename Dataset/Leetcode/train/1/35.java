 class Solution {
    // O(n) 哈希表（一次哈希）
    public int[] XXX(int[] nums, int target) {
        if (nums != null) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (hashMap.containsKey(temp))
                    return new int[]{hashMap.get(temp), i};
                else
                    hashMap.put(nums[i], i);
            }
        }
        return null;
    }
}

