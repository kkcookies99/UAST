 class Solution {
    public int[] XXX(int[] nums, int target) {
        //时间复杂度O(n),空间复杂度O(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], i);
            }   
        }
        
        for (int j = 1; j < nums.length; j++) {
            if (map.get(target - nums[j]) != null && map.get(target - nums[j]) != j) {
                return new int[]{map.get(target - nums[j]), j};
            }
        }
        return new int[]{0};
    }
}

