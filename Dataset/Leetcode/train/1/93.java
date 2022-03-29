 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0)
            return res;
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        for(int i = 0; i < len; i++) {
            int ans = target - nums[i];
            if(map.containsKey(ans) && map.get(ans) != i){
                res[0] = map.get(ans);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}

