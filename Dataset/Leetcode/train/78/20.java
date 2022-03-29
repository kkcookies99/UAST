class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        dfs(nums,temp,0);
        res.add(new ArrayList<>());
        return res;
    }
    public List<List<Integer>> res=new ArrayList<>();
    public void dfs(int []nums,List<Integer> temp,int len){
        for(int i=len;i<nums.length;i++){
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            dfs(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}

