class Solution {
    static List<List<Integer>> res = new LinkedList<>();
 @
    public List<List<Integer>> XXX(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        help(nums, track);
        return res;
    }

    public void help(int[] nums, LinkedList<Integer> track) {
        // 满足结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        // for 选择 in 选择列表
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            help(nums, track);
            // 撤销选择
            track.removeLast();
        }
    }
}

