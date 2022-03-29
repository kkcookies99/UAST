class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        dfs(0, nums, new ArrayList<>(), isVisited, ans);
        return ans;
    }

    public void dfs(int j, int[] nums, List<Integer> tmp, 
                boolean[] isVisited, List<List<Integer>> ans){
        if(j == nums.length){
            ans.add(new ArrayList(tmp)); // 如果是  ans.add(tmp),则全部是空的
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                tmp.add(nums[i]);
                dfs(j+1, nums, tmp, isVisited, ans);
                isVisited[i] = false;
                tmp.remove(tmp.size()-1);
            }
        }
        
            
    }
}

