class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        int len = nums.length;
        res.add(new ArrayList());
        if (len == 0) {
            return res;
        }
        Deque<Integer> combine = new LinkedList();
        dfs(res, combine, 0, nums);
        return res;
    }

    public void dfs(List<List<Integer>> res, Deque<Integer> combine, int depth, int[] nums) {
        for (int i = depth; i < nums.length; i++) {
            combine.addLast(nums[i]);
            res.add(new ArrayList(combine));
            dfs(res, combine, i + 1, nums);
            combine.removeLast();
        }
    }
}

