class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length, m = 1 << n;

        for (int i = 0; i < m; i++) {
            List<Integer> set = new LinkedList<>();
            int num = i, idx = 0;
            while (num > 0) {
                if ((num & 1) == 1) {
                    set.add(nums[idx]);
                }
                num >>= 1;
                idx++;
            }
            res.add(set);
        }

        return res;
    }
}

