 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ress = new ArrayList();
        List<Integer> res = new ArrayList();
        //int len = nums.length;
        ress.add(res);
        dfs(ress,res,0,nums);
        return ress;
    }
    
    public void dfs(List ress,List temp,int i,int[] nums){
        int len = nums.length;
        if(i>=len) return;
        List res ;
        for(int j = i ; j < len ; j++){
            res = new ArrayList<>(temp);
            res.add(nums[j]);
            ress.add(res);
            dfs(ress,res,j+1,nums);
        }
    }
}

