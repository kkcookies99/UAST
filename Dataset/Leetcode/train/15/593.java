 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 思路: 回溯 + 剪枝
        // 分析:
        // 解决数据重复元素: sort + visited 数组
        // 递归结束条件: depth == 3 && sum == 0
        // 同一个元素只能出现一次: curI 剪枝

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, 0, nums.length, 0, 0, nums.length, 
            visited, cur, res);
        return res;
    }

    public void dfs(int[] nums, int depth, int maxDepth, int sum, int curI,int len, boolean[] visited, List<Integer> cur, List<List<Integer>> res) {
        // 剪枝 防止超时
        if (depth > 3)
            return ;
        if (depth == 3 && sum != 0)
            return ;
        if (depth == 3 && sum == 0) {
            res.add(new ArrayList<>(cur));
            return ;
        }

        for (int i = curI; i < len; i++) {
            // 去重剪枝 
            if (i > 0 && nums[i] == nums[i-1] && !visited[i-1])
                continue;
            if (visited[i] == false) {
                visited[i] = true;
                cur.add(nums[i]);
                // i + 1 剪枝
                dfs(nums, depth + 1, maxDepth, sum + nums[i], i + 1, len,
                    visited, cur, res);
                visited[i] = false;
                cur.remove(cur.size() - 1);
            }
        }
    }
}

