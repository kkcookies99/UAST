 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        int len = nums.length;
        Arrays.sort(nums);
        int left;
        int right;

        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num > 0) {
                break;
            }
            if (i >= 1 && num == nums[i-1]) {
                continue;
            }
            left = i + 1;
            right = len - 1;

            while (left < right) {
                int sum = num + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(num, nums[left], nums[right]));
                    left++;
                    right--;
                    while (left + 1 < len && nums[left-1] == nums[left]) {
                        left++;
                    }
                    while (right - 1 >= 0 && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return res;
    }
}

