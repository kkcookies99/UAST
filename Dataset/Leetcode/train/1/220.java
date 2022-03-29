 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> record = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(record.containsKey(nums[i])){
                ans[0] = record.get(nums[i]);
                ans[1] = i;
                return ans;
            }else{
                record.put(target - nums[i], i);
            }
        }

        return ans;
    }
}

