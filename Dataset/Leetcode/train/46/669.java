 public List<List<Integer>> XXX(int[] nums) {
    if (nums == null) {
        return new ArrayList<>(0);
    }
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> init = new ArrayList<>();
    init.add(nums[0]);
    ans.add(init);
    for (int i = 1; i < nums.length; i++) {
        List<List<Integer>> cur = new ArrayList<>();
        for (List<Integer> each : ans) {
            for (int k = 0; k <= each.size(); k++) {
                List<Integer> tmp = new ArrayList<>(each);
                tmp.add(k, nums[i]);
                cur.add(tmp);
            }
        }
        ans = cur;
    }
    return ans;
}
