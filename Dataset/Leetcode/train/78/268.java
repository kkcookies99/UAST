public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> list = new LinkedList<>();
    dfs(nums,res,list,0);
    res.forEach(tmp-> System.out.println(tmp));
    return res;



}

private void dfs(int[] nums, List<List<Integer>> res, List<Integer> list, int index) {
    // 所有数据均添加
    res.add(new LinkedList<>(list));

    for (int i = index; i < nums.length; i++) {
        list.add(nums[i]);
        dfs(nums, res, list, i + 1);
        list.remove(list.size() - 1);
    }
}

