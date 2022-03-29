class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        res.add(path);
        dfs(res, path, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, int[] nums, int begin){
        for(int i = begin; i < nums.length; i++){
            path.add(nums[i]);
            res.add(new ArrayList<>(path));
            dfs(res, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

