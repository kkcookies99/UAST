class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        result.add(list);
        for (int i = 0; i < nums.length; i++) {
            list = new ArrayList<>();
            list.add(nums[i]);
            result.add(list);
            traceback(nums, i+1, list);
        }
        return result;
    }

    public void traceback(int[] nums, int index, List<Integer> list) {
        if (index == nums.length) {
            return;
        }
        List<Integer> newList;
        for (int i = index; i < nums.length; i++) {
            newList = new LinkedList<>(list);
            newList.add(nums[i]);
            result.add(newList);
            traceback(nums, i+1, newList);
        }
    }
}

