 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length - 1;i++){
            map.put(nums[i],i);
            if(map.get(target - nums[i+1]) != null){
                return new int[]{map.get(target - nums[i+1]),i+1};
            }
            
        }
        
        throw new IllegalArgumentException("No two sum solution"); 
    }
}

