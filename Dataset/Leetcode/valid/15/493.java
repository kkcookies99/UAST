 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);  // nlogn
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {  // n
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {  // n
                if (nums[left] + nums[right] == -nums[i]) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < -nums[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

