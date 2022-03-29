class Solution {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> XXX(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track, 0);
        return res;
    }

    public void backtrack(int[] nums, LinkedList<Integer> track, int start) {
        //踩坑：
        //要将该路径用一个新的List装起来，因为这里加入的是引用
        //不同于C++里的容器vector,push_back进去的是值
        res.add(new LinkedList<>(track)); 

        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(nums, track, i + 1);
            track.removeLast();
        }
    }
}

