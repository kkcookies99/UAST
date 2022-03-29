 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(nums,res,new ArrayList<Integer>());
        return res; 
    }
    //cur来记录当前路径
    private void dfs(int[] nums, List<List<Integer>> res, List<Integer> cur) {
        if (cur.size()==nums.length) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int ele : nums) {
            if (cur.contains(ele)) continue;
            cur.add(ele);
            dfs(nums,res,cur);
            //dfs一条路径访问完毕，回溯到上一步
            cur.remove(cur.size()-1);
        }
    }

}

