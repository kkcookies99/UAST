class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfsHelper(new LinkedHashSet<>(), nums, ans);
        return ans;
    }

    private void dfsHelper(LinkedHashSet<Integer> visited, int[] nums, List<List<Integer>> ans) {
        if (visited.size() == nums.length) {
            ans.add(new ArrayList<>(visited));
            return;
        }

        int startIndex = 0;
        while (startIndex < nums.length) {
            if (!visited.contains(nums[startIndex])) {
                visited.add(nums[startIndex]);
                dfsHelper(visited, nums, ans);
                visited.remove(nums[startIndex]);
            }
            startIndex++;
        }
    }
}

