class Solution {
    List<List<Integer>> res=new ArrayList<>();
    int[] visit;
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        this.visit=new int[nums.length];
        dfs(0,nums,curr);
        return res;
    }
    public void dfs(int start,int[] nums,List<Integer> curr){
        if(curr.size()>nums.length) return;
        res.add(new ArrayList(curr));
        for(int i=start;i<nums.length;i++){
            if(visit[i]==1) continue;
            visit[i]=1;
            curr.add(nums[i]);
            dfs(i+1,nums,curr);
            curr.remove(curr.size()-1);
            visit[i]=0;
        }
    }
}

