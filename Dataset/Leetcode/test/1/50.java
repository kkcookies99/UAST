 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> existMap= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(existMap.containsKey(target-nums[i])){
                return new int[]{existMap.get(target-nums[i]),i};
            }
            existMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

