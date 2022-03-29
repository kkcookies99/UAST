 class Solution {
    public int[] XXX(int[] nums, int target) {
        // corner case
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                res[0] = i;
                res[1] = map.get(num);
                return res;
            }
            map.put(target - num, i);
        }

        return res;
    }
}

