class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }
        backtracking(numbers, res, 0);
        return res;
    }

    void backtracking(ArrayList<Integer> nums, List<List<Integer>> res, int index) {
        if (index == nums.size() - 1) {
            ArrayList<Integer> oneAnswer = new ArrayList<>(nums);
            res.add(oneAnswer);
            return;
        }
        for (int i = index; i < nums.size(); i++) {
            Collections.swap(nums, index, i);
            backtracking(nums, res, index + 1);
            Collections.swap(nums, index, i);
        }
    }
}

