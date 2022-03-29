class Solution {
    List<List<Integer>> res = new ArrayList<> ();
    public List<List<Integer>> XXX(int[] nums) {
        backtrack(nums, new ArrayList<> (), 0);
        return res;
    }
    private void backtrack(int[] nums, List<Integer> cur, int index) {
        res.add(new ArrayList<> (cur));
        for (int i = index; i < nums.length; ++i) {
            cur.add(nums[i]);
            backtrack(nums, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}

