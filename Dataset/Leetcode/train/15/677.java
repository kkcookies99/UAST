 class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> sum = new Solution().XXX(nums);
        System.out.println(sum);
    }

    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // sort {1,2,3,4,5}
        Arrays.sort(nums);
        // 3 foreach
        for (int idx1 = 0; idx1 < nums.length; idx1++) {
            if (idx1 > 0 && nums[idx1] == nums[idx1 - 1]) {
                continue;
            }
            // 初始化第二个数和第三个数的索引
            int idx2 = idx1 + 1, idx3 = nums.length - 1;
            int target = -nums[idx1];
            while (idx2 < idx3) {
                switch (Integer.compare(nums[idx2] + nums[idx3], target)) {
                    case 1: {
                        // 两数相加距离目标偏大，需要减小，右边数左移
                        idx3--;
                        break;
                    }
                    case -1: {
                        // 两数相加距离目标偏小，需要加大，左边数右移
                        idx2++;
                        break;
                    }
                    default: {
                        // match equals 0
                        result.add(Arrays.asList(nums[idx1], nums[idx2], nums[idx3]));
                        while (idx2 < idx3 && nums[idx2] == nums[idx2 + 1]) {
                            // forward
                            idx2++;
                        }
                        while (idx2 < idx3 && nums[idx3] == nums[idx3 - 1]) {
                            // forward
                            idx3--;
                        }
                        idx2++;
                        idx3--;
                    }
                }
            }
        }
        return result;
    }
}

