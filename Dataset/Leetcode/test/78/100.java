class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {       
        dfs(nums,0,new ArrayList<>());
        return res;
    }
    public void dfs(int[] nums,int index,List<Integer> ans){
        if(index==nums.length){
            res.add(new ArrayList(ans));
            return ;
        }
        ans.add(nums[index]);
        dfs(nums,index+1,ans);
        ans.remove(ans.size()-1);
        dfs(nums,index+1,ans);
        
    }
}

