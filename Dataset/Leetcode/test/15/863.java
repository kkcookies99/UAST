 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        if (3 > nums.length) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ++i) {
            if (0 < nums[i]) break;
            if (0 < i && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) --right;
                else if (sum < 0) ++left;
                else if (0 == sum) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) ++left;
                    while(left < right && nums[right] == nums[right - 1]) --right;
                    ++left; --right;
                }
            }
        }
        return ans;
    }
}

