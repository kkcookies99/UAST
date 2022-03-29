class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        ArrayList<Integer> path = new ArrayList<>();
        Arrays.sort(nums); // 排序 加快后续搜索
        backtrace(nums, path, 0);
        return res;
    }

    private void backtrace(int[] nums, ArrayList<Integer> path, int start) {
        res.add(new ArrayList<>(path));
        // start 本轮搜索起始下标
        for (int i = start; i < nums.length; i++) {
            // 剪枝
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backtrace(nums, path, i + 1); // 下一轮(i+1)不包含自身
            path.remove(path.size() - 1);
        }
    }
}

