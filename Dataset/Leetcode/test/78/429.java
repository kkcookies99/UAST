 class Solution {
    //DFS.以cur为当前结果,添加进res.对其进行循环,依次添加从i开始向后的每一个元素,进行dfs,退出dfs,然后删除刚刚添加的元素
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> cur) {
        res.add(new ArrayList<>(cur));
        for (int j = i; j < nums.length; j++) {
            cur.add(nums[j]);
            backtrack(j + 1, nums, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}

