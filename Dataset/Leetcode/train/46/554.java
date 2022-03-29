 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        XXX(nums, 0, list, res, visited);
        return res;
    }

    public void XXX(int[] nums, int idx, List<Integer> list, List<List<Integer>> res, Set<Integer> visited) {
         //说明已经全部访问完了
        if(visited.size() == nums.length){
            res.add(new ArrayList(list));
            return;
        }
        //套用dfs模版
        for(int i=0;i<nums.length;i++){
            if(!visited.contains(nums[i])){
                list.add(nums[i]);
                visited.add(nums[i]);
                XXX(nums, 0, list, res, visited);
                visited.remove(nums[i]);
                list.remove(list.size()-1);
            }
        }
    }

}

