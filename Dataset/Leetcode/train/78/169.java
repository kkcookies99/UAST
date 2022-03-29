class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        int len = nums.length;
        Deque<Integer> deque = new ArrayDeque<>(nums.length);
        dfs(nums, len, deque, resultList, 0);
        resultList.add(new ArrayList<>());
        return resultList;
    }

    public void dfs(int[] nums, int len, Deque<Integer> deque,
                    List<List<Integer>> resultList, int offset){
        for (int i = offset; i < len; i++) {
            deque.addLast(nums[i]);
            resultList.add(new ArrayList<>(deque));
            dfs(nums, len, deque, resultList, i+1);
            deque.removeLast();
        }
    }
}

