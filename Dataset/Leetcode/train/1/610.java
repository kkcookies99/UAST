 class Solution {
    public int[] XXX(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] res = new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if (map.containsKey(temp) && i!=map.get(temp)) {
                res[0]=i;res[1]=map.get(temp);
            }
        }
        return res;

    }
}

