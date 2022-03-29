class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> node = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            node.add(nums[i]);
        }
        show(new ArrayList<>(),nums.length);
        return res;
    }

    public void show(List<Integer> value,int target) {
        if (value.size() == target) {
            res.add(new ArrayList<>(value));
            return;
        }
        int len = node.size();

        for (int i = 0; i < len; i++) {

            Integer val = node.remove(0);
            value.add(val);
            show(value, target);
            value.remove(value.size() - 1);
            node.add(val);
        }

    }

}
