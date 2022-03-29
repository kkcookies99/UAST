 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            
            // 如果 开头就大于零，那就没得玩儿了
            if (nums[i] > 0) break;

            // 如果和上一个一样，那也就不用去找了
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 双指针
            for (int j = i + 1, k = len - 1; j < k; ) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    List<Integer> t = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(t);

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;

                    continue;
                }

                if (sum > 0) k--;
                if (sum < 0) j++;
            }
        }

        return result;
    }
}

