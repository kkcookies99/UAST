class Solution {
    public boolean XXX(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        return can(nums,0,map);
    }

    private boolean can(int[] nums,int cur,Map<Integer,Boolean> map){
        if(map.containsKey(cur)){
            return map.get(cur);
        }
        if(cur >= nums.length-1){
            return true;
        }
        boolean canJ = false;
        for(int i=1;i<=nums[cur];i++){
            canJ |= can(nums,cur+i,map);
            if(canJ)break;
        }
        map.put(cur,canJ);
        return canJ;
    }
}

