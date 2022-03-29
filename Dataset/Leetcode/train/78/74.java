class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList();
        if(len == 0) return ans;
        List<Integer> path = new ArrayList();
        ans.add(path);
        Arrays.sort(nums);
        dfs(nums, len, path, ans, 0);
        return ans;
    }
    void dfs(int[] nums, int len, List<Integer> path, List<List<Integer>> ans, int start){
        if(start == len) return;
        
        for(int i = start; i < len; i++){
            path.add(nums[i]);
            ans.add(new ArrayList(path));
            dfs(nums, len, path, ans, i+1);
            path.remove(path.size() - 1);
        }
    }
}

