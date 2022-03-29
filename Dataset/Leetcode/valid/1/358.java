 class Solution {
     public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> hashSet = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
            Integer index = hashSet.get(target - nums[i]);
            if(index != null){
                if(i < index){
                    return new int[]{i , index};
                } else {
                    return new int[]{index , i};
                }
            } else {
                hashSet.put(nums[i] , i);
            }
        }
        
        return new int[]{};
    }
}

