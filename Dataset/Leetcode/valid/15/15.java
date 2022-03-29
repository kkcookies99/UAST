 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 返回体
        List<List<Integer>> lists = new ArrayList<>();
        // 排序
        Arrays.sort(nums);
        // 一次遍历
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return lists;
            }
             // 避免重复项
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 双指针定义
            int L = i + 1;
            int R = nums.length - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    lists.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 避免重复项
                    while (L < R && nums[L + 1] == nums[L]) {
                        L++;
                    }
                    while (L < R && nums[R - 1] == nums[R]) {
                        R--;
                    }
                    L++;
                    R--;
                } else if (sum > 0) {
                    R --;
                } else {
                    L ++;
                }
            }

        }
        return lists;
    }
}

