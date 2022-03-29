 public List<List<Integer>> XXX(int[] nums) {
    int[] map = new int[nums.length];
    dfs(nums, 0, 0, new ArrayList<>(), 0, map);
    return new ArrayList<>(res);
}

public void dfs(int[] nums, int cur, int time, List<Integer> list, int pos, int[] map) {

    if (time == 3 && cur == 0) {
        ArrayList<Integer> rest = new ArrayList<>(list);
        rest.sort(Integer::compareTo);
        res.add(rest);
    }
    if (time < 3) {
        for (int i = pos; i < nums.length; i++) {
            if (map[i] == 0) {
                list.add(nums[i]);
                map[i] = 1;
                dfs(nums, cur + nums[i], time + 1, list, pos + 1, map);
                list.remove(list.size()-1);
                map[i] = 0;
            }
        }
    }
}` 
