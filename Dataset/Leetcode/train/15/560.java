 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            XXX(nums, i + 1, nums.length - 1, res, nums[i]);
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
        return res;
    }


    private void XXX(int nums[], int l, int r, List<List<Integer>> list, int tar) {
        while (l < r) {
            if (tar + nums[l] + nums[r] == 0) {
                list.add(Arrays.asList(tar, nums[l], nums[r]));
                while (l < r && nums[l] == nums[l + 1]) {
                    ++l;
                }
                ++l;
            } else if (tar + nums[l] + nums[r] < 0) {
                ++l;
            } else {
                --r;
            }
        }
    }
}

