 class Solution {
    public int[] XXX(int[] nums, int target) {//一次遍历，边存边验证
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                return new int[]{m.get(nums[i]),i};
            }
            m.put(target-nums[i],i);
        }
        return null;
    }
}

