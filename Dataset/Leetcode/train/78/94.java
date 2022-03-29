class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        dfs(0, nums);
        return res;
    }

    public void dfs(int start, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}

