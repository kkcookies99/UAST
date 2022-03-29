 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //排列组合  回溯问题
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || nums.length == 0) return ans;
        int length = nums.length;
        int[] visited = new int[length];
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,length,0,visited,temp,ans);
        return ans;
    }
    public void backtrack(int[] nums,int length,int depth,int[] visited,List<Integer> temp,List<List<Integer>> ans){
        if(depth == length){
            //如果已经确定了depth个元素等于length 则直接返回
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i = 0;i<length;i++){
            if(visited[i] == 0){
                visited[i] = 1;
                temp.add(nums[i]);
                backtrack(nums,length,depth+1,visited,temp,ans);
                temp.remove(temp.size()-1);
                visited[i] = 0;
            }
        }
    }
}

