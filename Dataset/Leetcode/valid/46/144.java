class Solution {
    
    private List<List<Integer>> ret;
    
    private boolean[] used;
    
    public List<List<Integer>> XXX(int[] nums) {
        ret = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ret;
        }
        used = new boolean[nums.length];
        generatePermutation(nums, new ArrayList<>(nums.length));
        return ret;
    }
    
    private void generatePermutation(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, list);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
    
}

