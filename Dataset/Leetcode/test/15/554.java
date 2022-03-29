 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int k = n - 1;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                while (k > j && sum + nums[k] > 0) {
                    k--;
                }
                if (k > j && sum + nums[k] == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }

        return res;
    }
}

