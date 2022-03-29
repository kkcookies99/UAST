 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] st = new boolean[n];
        dfs(0, nums, st, path, ans);
        return ans;
    }
    // u 代表当前决策到答案的第几位，st 代表当前哪些数已经被用过了，用过的数会出现在 path 中，path 为中间处理结果
    void dfs(int u, int[] nums, boolean[] st, List<Integer> path, List<List<Integer>> ans) {
        if (u == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!st[i]) {
                st[i] = true;
                path.add(nums[i]);
                dfs(u + 1, nums, st, path, ans);
                st[i] = false;
                path.remove((Integer)nums[i]);
            }
        }
    }
}

