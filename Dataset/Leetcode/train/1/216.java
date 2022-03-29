 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                res[0]=map.get(temp);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

