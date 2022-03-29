 class Solution {
    public List<List<Integer>> XXX(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Deque<Integer> deque = new ArrayDeque<>(nums.length);

        dfs(nums, used, deque, result);

        return result;

    }

    private void dfs(int[] nums, boolean[] used, Deque<Integer> deque, List<List<Integer>> result) {

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            deque.addLast(nums[i]);

            if (deque.size() == nums.length) {
                List<Integer> collect = new ArrayList<>(deque);
                result.add(collect);
            } else {
                dfs(nums, used, deque, result);
            }

            deque.removeLast();
            used[i] = false;
        }

    }
}

