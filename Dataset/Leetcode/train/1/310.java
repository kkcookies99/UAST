 class Solution {
    public int[] XXX(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-map.get(nums[i]))){
                    return new int[]{map.get(target-map.get(nums[i])),i};
                }else{
                    map.put(nums[i],i);
                }
            }
            return new int[0];
    }
}

