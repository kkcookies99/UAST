class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        return XXX(nums, 0);
    }

    public List<List<Integer>> XXX(int[] nums, int start) {
        if (start == nums.length) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }
        List<List<Integer>> res = XXX(nums, start + 1);
        int sub_len = res.size();
        for (int i = 0; i < sub_len; i++) {
            List<Integer> tmp = new ArrayList<>(res.get(i));
            tmp.add(nums[start]);
            res.add(tmp);
        }
        return res;
    }
}

