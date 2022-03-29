 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result =  new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.get(target-nums[i]) == null){
                map.put(nums[i],i);
            }else{
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

