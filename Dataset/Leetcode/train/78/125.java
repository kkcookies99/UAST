class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> XXX(int[] nums) {
        x = new int[nums.length];
        dfs(nums,0);
        return ans;
    }
    
    int x[];
    
    private void dfs(int nums[],int cur) {
        if (cur >= nums.length) {
            List<Integer> one = new ArrayList<>();
            for (int i = 0;i < x.length;i++) {
                if (x[i] == 1) {
                    one.add(nums[i]);
                }
            }
            ans.add(one);
        } else {
            x[cur] = 0;dfs(nums,cur + 1);// 选当前
            x[cur] = 1;dfs(nums,cur + 1);// 不选当前
        }
    }
}

