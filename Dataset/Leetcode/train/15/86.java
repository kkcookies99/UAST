 class Solution {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new LinkedList<>(),0,0);
        return result;
    }

    void backtrack(int[] nums,List<Integer> numbers,int totalNum,int start) {
        if (numbers.size() == 3) {
            if (totalNum == 0) {
                result.add(new LinkedList<>(numbers));
            }
            return;
        }
        Integer flag = null;
        for (int i = start; i < nums.length; i++) {
            if (flag != null && nums[i] == flag) {
                continue;
            }
            flag = nums[i];
            numbers.add(nums[i]);
            totalNum += nums[i];
            backtrack(nums, numbers, totalNum, i + 1);
            totalNum -= nums[i];
            numbers.remove(numbers.size() - 1);
        }
    }
}

