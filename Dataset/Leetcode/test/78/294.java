class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(nums, ans, temp, 0);
        return ans;
    }

    public void backtracking(int[] nums, List<List<Integer>> ans, List<Integer> temp, int len) {
        ans.add(new ArrayList<>(temp));
        if (len == nums.length) {
            return;
        }
        for (int i = len; i < nums.length; i++) {
            temp.add(nums[i]);
            // 每次递归从上一次的后一位开始，避免重复:
            backtracking(nums, ans, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

