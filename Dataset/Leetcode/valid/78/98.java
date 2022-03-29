class Solution {
    List<List<Integer>> retList;

    public List<List<Integer>> XXX(int[] nums) {
        retList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, list, 0);
        return retList;
    }

    private void dfs(int[] nums, List<Integer> list, int index) {
        if (list.size() > nums.length) {
            return;
        }
        if (list.size() <= nums.length) {
            retList.add(new ArrayList(list));
        }

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}

