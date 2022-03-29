    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans ;
    }
    private void helper(int[] nums,int idx,List<List<Integer>> ans,List<Integer> res){
        if(idx == nums.length)
            ans.add(res);
        else{
            List<Integer> p = new ArrayList<>(res);
            p.add(nums[idx]);
            helper(nums,idx+1,ans,res);
            helper(nums,idx+1,ans,p);    
        }
    }

