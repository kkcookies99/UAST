 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int low = i + 1;
            int high = n - 1;
            int target = 0 - nums[i];
            while (low < high) {
                int XXX = nums[low] + nums[high];
                if (XXX == target) {
                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                } else if (XXX < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return ans;
    }
}

