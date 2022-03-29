class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        traceback(new ArrayList<>(), nums);
        return result;
    }

    public void traceback(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            List<Integer> res = new ArrayList<>(list);
            result.add(res);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                traceback(list, nums);
                list.remove((Integer)nums[i]);
            }
        }
    }
}

