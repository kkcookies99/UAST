 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i= 0,j =0;
        for(i = 0;i < nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                j = map.get(target-nums[i]);
                break;
            }
        }
        return new int[]{i,j};
    }
}

