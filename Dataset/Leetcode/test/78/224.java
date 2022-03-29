class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        dfs(nums,0,temp);
        return ans;
    }
    public  void dfs(int[] nums,int k,List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i = k;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}

