class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums, 0);
        return res;
    }
    public void dfs(int[] nums, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, i+1);
            list.remove(list.size()-1);
        }
    }
}


