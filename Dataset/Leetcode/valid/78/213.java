class Solution {
    List<List<Integer>> res = new ArrayList<> ();
    public List<List<Integer>> XXX(int[] nums) {
        backtrack(nums, 0, new ArrayList<> ());
        return res;
    }
    private void backtrack(int[] nums, int cur, List<Integer> list) {
        if (cur == nums.length) {
            res.add(new ArrayList<> (list));
            return;
        }
        backtrack(nums, cur + 1, list);
        list.add(nums[cur]);
        backtrack(nums, cur + 1, list);
        list.remove(list.size() - 1);
    }
}

