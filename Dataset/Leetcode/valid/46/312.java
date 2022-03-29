class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tem = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, tem, ans, 0, used);
        return ans;
    }

    public void dfs(int[] nums, List<Integer> tem, List<List<Integer>> ans, int deep, boolean[] used){
        // ① 出口
        if(deep == nums.length){
            ans.add(new ArrayList<>(tem));
        }
        // ② 遍历该层可选值
        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                tem.add(nums[i]);
                used[i] = true;
                dfs(nums, tem, ans, deep+1, used);
                tem.remove(tem.size()-1);
                used[i] = false;
            }
        }
    }
}

