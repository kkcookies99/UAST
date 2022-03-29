class Solution {

    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    boolean[] used;
    public List<List<Integer>> XXX(int[] nums) {
        if (nums.length == 0){
            return result;
        }
        used = new boolean[nums.length];
        XXXHelper(nums);
        return result;
    }

    private void XXXHelper(int[] nums){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i]){
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            XXXHelper(nums);
            path.removeLast();
            used[i] = false;
        }
    }
}

