class Solution {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> temp = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        result.add(new LinkedList<>());
        for(int i = 0; i < nums.length; i++){
            recall(nums, i);
            temp.remove(temp.size() - 1);
        }
        return result;
    }
    public void recall(int[] nums, int n){
        temp.add(nums[n]);
        result.add(new ArrayList<>(temp));
        for(int i = n + 1; i < nums.length; i++){
            recall(nums, i);
            temp.remove(temp.size() - 1);
        }
    }
}

