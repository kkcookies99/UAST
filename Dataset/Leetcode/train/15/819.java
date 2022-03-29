 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // 固定一位
        for (int k = 0; k < nums.length - 2; k++) {

            // nums[k] > 0 那就三个数都 > 0，和 不可能为 0
            if (nums[k] > 0) break;

            // 跳过重复数
            if (k > 0 && nums[k] == nums[k - 1]) continue;

            // [k + 1, len - 1] 扫描
            for (int i = k + 1, j = nums.length - 1; i < j; ) {
                
                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));

                    // 跳过重复数
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);

                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return res;
    }
}

