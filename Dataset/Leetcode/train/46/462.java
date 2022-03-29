 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, new ArrayDeque<>(), res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, Deque<Integer> cur, List<List<Integer>> res) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                cur.push(nums[i]);
                dfs(nums, used, cur, res);
                cur.pop();
                used[i] = false;
            }
        }
    }
}

