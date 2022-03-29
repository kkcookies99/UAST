 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        find(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    public void find(int[] nums, int start, List<Integer> temp, List<List<Integer>> result) {

        result.add(temp);//数组是去重的所以无需检查重复

        for (int i = start; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>(temp);
            list.add(nums[i]);
            find(nums, i + 1, list, result);
        }
    }

    
}

