class Solution {
    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    public List<List<Integer>> XXX(int[] nums) {
        if (nums.length == 0){
            result.add(new ArrayList<>());
            return result;
        }
        XXXHelper(nums, 0);
        return result;
    }

    private void XXXHelper(int[] nums, int startIndex){
        result.add(new ArrayList<>(path));//「遍历这个树的时候，把所有节点都记录下来，就是要求的子集集合」。
        if (startIndex >= nums.length){ //终止条件可不加
            return;
        }
        for (int i = startIndex; i < nums.length; i++){
            path.add(nums[i]);
            XXXHelper(nums, i + 1);
            path.removeLast();
        }
    }
}

