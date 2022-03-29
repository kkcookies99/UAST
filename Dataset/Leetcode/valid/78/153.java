class Solution {
    /*
        思路：回溯 
    */
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return res;
        res.add(new ArrayList<>());
        dfs(0,nums,res,new ArrayList<>());
        return res;
    }
    public void dfs(int curIdx,int[] nums,List<List<Integer>> res,List<Integer> l){
        for(int i = curIdx;i < nums.length;i++){
            l.add(nums[i]);
            res.add(new ArrayList<>(l));
            dfs(i + 1,nums,res,l);
            l.remove(l.size() - 1);
        }
    }
}

