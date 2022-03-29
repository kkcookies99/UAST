class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    void dfs(int[] nums, int vis, List<Integer> path) {
        if (path.size() == nums.length) {
            res.add(new ArrayList(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if ((vis & (1 << i)) == 0) {
                path.add(nums[i]);
                dfs(nums, vis ^ (1 << i), path);
                path.remove(path.size() - 1);
            }
        }
    }
}

