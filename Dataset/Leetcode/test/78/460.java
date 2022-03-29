 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> paths = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        compute(nums, paths, path);
        return paths;
    }

    private void compute(int[] nums,
                         List<List<Integer>> paths,
                         Stack<Integer> path) {
        if (nums == null || nums.length == 0) {
            return; //null nums should'nt dfs
        }
        dfs(nums, 0, paths, path);
    }

    private void dfs(int[] nums,
                     int cur,
                     List<List<Integer>> paths,
                     Stack<Integer> path) {
        if (cur == nums.length) {
            paths.add(new ArrayList<>(path));
            return;
        }
        path.push(nums[cur]); 
        dfs(nums, cur + 1, paths, path); //state.1 : choose push to list

        //backtracking
        path.pop();

        dfs(nums, cur + 1, paths, path); //state.2 : choose not push to list

    }
}

