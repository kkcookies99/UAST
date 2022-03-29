 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        dfs(res, new ArrayList<Integer>(), map, nums, new boolean[nums.length], 0, 2, 0, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, Map<Integer, Integer> map, int[] nums, boolean[] used, int depth, int maxDepth, int sum, int begin){
        if(depth == maxDepth){
            // 缩短为二重循环，但用 map 还是要去重
            if(map.getOrDefault(-sum, 0) > 0 && -sum >= path.get(path.size() - 1)){
                path.add(-sum);
                res.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }
        }else{
            // 正数剪枝
            if(begin == nums.length || sum >= 0 && nums[begin] > 0){
                return;
            }else{
                for(int i = begin; i < nums.length; i++){
                    if(!used[i]){
                        // 去重剪枝
                        if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                            continue;
                        }else{
                            path.add(nums[i]);
                            sum += nums[i];
                            used[i] = true;
                            map.put(nums[i], map.get(nums[i]) - 1);
                            dfs(res, path, map, nums, used, depth + 1, maxDepth, sum, i + 1);
                            path.remove(path.size() - 1);
                            sum -= nums[i];
                            used[i] = false;
                            map.put(nums[i], map.get(nums[i]) + 1);
                        }
                    }
                }
            }
        }
    }
}

