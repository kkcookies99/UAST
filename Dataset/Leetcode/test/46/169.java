class Solution {
    List<List<Integer>> reList=new ArrayList();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums,new ArrayList());
        return reList;
    }

    public void dfs(int[]nums,List<Integer> t){
        if(t.size()==nums.length){
            reList.add(t);
            return;
        }
        Set<Integer> set=new HashSet(t);
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                List<Integer> l=new ArrayList(t);
                l.add(nums[i]);
                dfs(nums,l);
            }
        }
    }
}

