 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null) return lists;
        Deque<Integer> path = new ArrayDeque<>();
        DFS(nums, lists, path, 0);
        return lists;
    }
    private void DFS(int[] nums, List<List<Integer>> lists, Deque<Integer> path, int begin){
        if(path.size() == nums.length){
            lists.add(new ArrayList<>(path));
        }
        for(int i = begin; i < nums.length; i++){
            if(path.contains(nums[i])){
                continue;
            }
            path.addLast(nums[i]);
            DFS(nums, lists, path, 0);
            path.removeLast();
        }
    }
}

