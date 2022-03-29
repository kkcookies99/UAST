 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        // sort
        Arrays.sort(nums);
        // 3 foreach
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int t = -nums[i];
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] > t) {
                    k--;
                } else if (nums[j] + nums[k] < t) {
                    j++;
                } else {
                    // find
                    List<Integer> ans = new LinkedList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    result.add(ans);
                    // 去除临近相同的元素
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}

