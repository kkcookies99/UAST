 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int tmp = nums[i] + nums[left] + nums[right];
                if (tmp == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left += 1;
                    while (left < right && nums[right] == nums[right - 1]) right -= 1;
                    left += 1;
                    right -= 1;
                } else if (tmp > 0) right -= 1;
                else left += 1;
            }
        }
        return res;

    }
}

