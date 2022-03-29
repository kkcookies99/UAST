class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTracing(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backTracing(int[] nums, int index, List<Integer> list, List<List<Integer>> res) {
        res.add(list);
        if (index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backTracing(nums, i + 1, new ArrayList<>(list), res);
            list.remove(list.get(list.size() - 1));
        }
    }
}

