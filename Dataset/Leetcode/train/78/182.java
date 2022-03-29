class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        callBacking(nums, 0, result, list);
        return result;
    }

    private void callBacking(int[] nums, int index, List<List<Integer>> result, List<Integer> list){
        for(int i = index; i <= nums.length; i++){
            if(i == nums.length) {
                result.add(new ArrayList<>(list));
                return;
            }
            list.add(nums[i]);
            callBacking(nums, i + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}

