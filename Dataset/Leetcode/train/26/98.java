 class Solution {
    public int XXX(int[] nums) {
        HashMap<Object, Object> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        return map.keySet().size();
    }
}

