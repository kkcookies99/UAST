class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(nums, ret, new ArrayList<>(),0);
        return ret;
    }

    private void dfs(int[] nums, List<List<Integer>> ret, List<Integer> subset, int i) {
        if (i == nums.length){
            ret.add(new ArrayList<>(subset));
            return;
        }
        // 选择i
        subset.add(nums[i]);
        dfs(nums,ret,subset,i+1);
        subset.remove(subset.size() - 1);
        // 不选择i
        dfs(nums,ret,subset,i+1);
    }
}```

