 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int k=0;k<nums.length;k++){
            if(map.get(target-nums[k])!=null&&map.get(target-nums[k])!=k){
                res[0]=k;
                res[1]=map.get(target-nums[k]);
            } 
        }
        return res;
    }
}

