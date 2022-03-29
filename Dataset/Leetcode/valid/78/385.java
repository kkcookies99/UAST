class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        ans.add(new ArrayList<>(path));
        for (int i = 1; i <= nums.length; i++) {
            dfs(nums, i, 0);
        }
        return ans;
    }
    private void dfs(int[] nums, int k, int start) {
        if (k == path.size()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if ((nums.length - start + 1) < (k - path.size())) return;
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, k, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

