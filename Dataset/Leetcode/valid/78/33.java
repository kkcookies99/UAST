class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(0,nums,new ArrayList<>());
        return res;
    }

    public void dfs(int start, int[] nums, ArrayList<Integer> list){
        if(!res.contains(new ArrayList<>(list))){
            res.add(new ArrayList<>(list));
        }
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            dfs(i+1, nums, list);
            list.remove(list.size()-1);
        }
    }
}

