 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int result[] = new int[2];
        int len = nums.length;
        for(int i = 0 ; i < len ; i ++){
            int a = target - nums[i];
            if(map.get(a) == null){
                map.put(nums[i],i);
            }else {
                result[0] = map.get(a);
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}

