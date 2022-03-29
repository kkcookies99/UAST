class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    int len;

    public List<List<Integer>> XXX(int[] nums) {
        if (nums == null) {
            return ans;
        }
        len = nums.length;
        backtrace(nums, 0, new ArrayList<>());
        return ans;
    }

    public void backtrace(int[] nums, int index, List<Integer> cur) {
        ans.add(new ArrayList<>(cur));
        for (int i = index; i < len; i++) {
            cur.add(nums[i]);
            backtrace(nums, i + 1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}

