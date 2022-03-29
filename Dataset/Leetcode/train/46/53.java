class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums,0,new ArrayList<>());
        return res;
    }
    private void dfs(int[] nums,int cur,List<Integer> tmp){
        //cur主要是用来判断是否到达组合数的长度
        if(cur > nums.length)  return;
        if(cur == nums.length){
            res.add(new ArrayList<>(tmp));
        }
        for(int i = 0; i < nums.length; i++){
            //判断之前是否添加过
            if(tmp.contains(nums[i])){
                continue;
            }
            tmp.add(nums[i]);
            dfs(nums,cur + 1,tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}

