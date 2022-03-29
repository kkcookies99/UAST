class Solution {
    public List<List<Integer>> XXX(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int k = nums.length;

        backing(result, path, nums, k);
        return result;
    }
    void backing(List<List<Integer>> result, List<Integer> path, int[] nums, int k){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        };
        for (int i = 0; i < k; i++) {
            if(!path.contains(nums[i])) {
                path.add(nums[i]);
                backing(result, path, nums, k);
                path.remove(path.size() - 1);
            }
        }
    }
}

