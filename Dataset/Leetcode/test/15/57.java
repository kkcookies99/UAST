 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while (i < nums.length - 2) {
            int target = -nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] > target) {
                    r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    List<Integer> ans = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(ans);
                    while (l < nums.length && nums[l] == ans.get(1)) l++; // 题目要求不能有重复三元组，故直接跳过相同的值
                    while (r > i && nums[r] == ans.get(2)) r--; // 同理
                }
            }
            int cur = nums[i];
            while (i < nums.length - 2 && nums[i] == cur) i++; // 同理
        }
        return res;
    }
}

