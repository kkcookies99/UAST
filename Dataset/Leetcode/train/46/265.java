class Solution {
    
    public List<List<Integer>> XXX(int[] nums) {
       ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayDeque<Integer> path = new ArrayDeque<>();
    //    int[] visited = new int[nums.length];  // 0未访问
        // HashMap<Integer, Boolean> visited = new HashMap<>();

        //更牛逼的数据结构 位图
        BitSet visited = new BitSet();   //但其实 hashmap也很快  速度差不多  都是索引查找

        dfs(nums, path, res, visited);

        return res;
    }


    public void dfs(int[] nums, ArrayDeque<Integer> path, ArrayList<List<Integer>> res, BitSet visited) {

        //结束条件
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (visited.get(i)) {
                //如果访问过
                continue;
            }

            path.addLast(nums[i]);
            visited.set(i);

            dfs(nums, path, res, visited);
            path.removeLast();
            visited.clear(i);
        }
    }
}

