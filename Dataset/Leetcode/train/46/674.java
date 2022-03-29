 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> cur = new ArrayList();
        List<List<Integer>> res = new ArrayList();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, cur, res, visited);
        return res;
    }

    public void dfs(int[] nums, List<Integer> cur, List<List<Integer>> res, boolean[] visited){
        if(cur.size() == nums.length){
            res.add(new ArrayList(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            cur.add(nums[i]);
            dfs(nums, cur, res, visited);
            cur.remove(cur.size() - 1);
            visited[i] = false;
        }
    }
}

