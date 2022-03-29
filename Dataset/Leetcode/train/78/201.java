class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        return XXX(nums, 0, nums.length - 1);

    }

    private List<List<Integer>> XXX(int[] nums, int lo, int hi) {
        if (lo > hi) {
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());
            return outer;
        }

        int first = nums[lo];
        List<List<Integer>> rest = XXX(nums, lo + 1, hi);
        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> l : rest) {
            res.add(new ArrayList<>(l));
            l.add(first);
        }
        res.addAll(rest);
        return res;
    }
}

