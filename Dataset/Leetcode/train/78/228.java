class Solution {
        public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Collections.EMPTY_LIST);
        dfs(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    private void dfs(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int begin) {
        for (int i = begin; i < nums.length; i++) {
            tmp.add(nums[i]);
            res.add(new ArrayList<Integer>(tmp));
            dfs(res, tmp, nums, i + 1);
            tmp.remove(tmp.size() - 1);
        }
        
    }
}

