class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        List<Integer> path=new ArrayList();
        dfs(nums,0,path,res);
        return res;
    }
    public void dfs(int[] nums,int begin,List<Integer> path,List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for(int i=begin;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums,i+1,path,res);
            path.remove(path.size()-1);
        }
    }
}

