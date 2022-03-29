class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> board = new ArrayList<>();
        helper(0, res, nums, board);
        return res;
    }
    public void helper(int level, List<List<Integer>> res, int[] nums, List<Integer> board) {
        if (level == nums.length) {
            res.add(new ArrayList<>(board));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(board.contains(nums[i])) {
                    continue;
                }
                board.add(nums[i]);
                helper(level + 1, res, nums, board);
                board.remove(board.size() - 1);
            }
        }
    }
}

