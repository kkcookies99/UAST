 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int k = 0; k < n - 2; k++) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = n - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum > 0) {
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    j--;
                } else if (sum < 0) {
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    i++;
                } else {
                    ans.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}

