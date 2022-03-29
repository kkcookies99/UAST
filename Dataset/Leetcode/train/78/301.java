class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ansTem = new ArrayList<>();
        dfs(ans, ansTem, nums, 0);
        return ans;
    }
    public void dfs(List<List<Integer>> ans, List<Integer> ansTem, int[] nums, int cur){
        ans.add(new ArrayList<Integer>(ansTem));
        for(int i=cur; i<nums.length; i++){
            ansTem.add(nums[i]);
            dfs(ans, ansTem, nums, i+1);// 注意这里下一层递归循环的起始位置是i+1而不是cur+1
            ansTem.remove(ansTem.size()-1);
        }
    }
}

