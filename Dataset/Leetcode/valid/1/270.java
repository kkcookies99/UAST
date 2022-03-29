 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int j = 0; j < nums.length;j++){
            if(null != map.get(target-nums[j]))
                return new int[]{map.get(target-nums[j]),j};
            map.put(nums[j],j);
        }
        return null;
    }
}

