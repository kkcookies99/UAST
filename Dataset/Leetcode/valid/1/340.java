 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length-1,1.0f);
        for (int i = 0; i < nums.length; i++){
            if (map.get(target-nums[i])!=null){
               try{
                   return new int[]{map.get(target-nums[i]), i};
               }finally{
                System.gc();
               }
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

