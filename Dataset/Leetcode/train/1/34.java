 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (; i < nums.length/2; i++) {
            int k = nums.length - 1 - i;
            if (nums[i] + nums[k] == target){
                return new int[]{i,k};
            }
            if (!Objects.isNull(map.get(target-nums[i]))){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
            if (!Objects.isNull(map.get(target-nums[k]))){
                return new int[]{k, map.get(target-nums[k])};
            }
            map.put(nums[k], k);
        }
        return new int[]{i, map.get(target-nums[i])};
    }
}

