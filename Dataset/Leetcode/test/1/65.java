 class Solution {
    public int[] XXX(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                int index = target - nums[i];
                return new int[]{map.get(index), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;            
    }
}

