 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if (null == nums || nums.length == 0) {
            return result;
        }
        List<Integer> list = new ArrayList();
        dfs(result, nums, list);
        return result;
    }

    private void dfs(List<List<Integer>> result, int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < nums.length; i ++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            dfs(result, nums, list);
            list.remove(list.size()-1);
        }
    }

}

