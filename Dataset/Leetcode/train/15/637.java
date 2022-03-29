 class Solution {
       List<List<Integer>> rst = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        rst.clear();
        Arrays.sort(nums);
        backTrack(new ArrayList<>(), 0, nums, 0);
        return rst;
    }

    public void backTrack(List<Integer> path, int index, int[] nums, int sum) {
        if (path.size() == 3 && sum == 0) {
            rst.add(new ArrayList<>(path));
            return;
        }

        if (path.size() >= 3) {
            return;
        }


        for (int i = index; i < nums.length; ++i) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backTrack(path, i + 1, nums, sum + nums[i]);
            path.remove(path.size() - 1);
        }
    }
}

