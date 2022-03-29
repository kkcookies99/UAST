 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j != k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                } else if (sum > 0) k--;
                else j++;
            }
        }
        return new ArrayList<>(result);
    }
}

