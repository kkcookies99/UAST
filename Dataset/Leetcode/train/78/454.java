   public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < (1<<n);i++){
            List<Integer> res = new ArrayList<>();
            for(int j = 0;j < nums.length;j++){
                if((i & (1<<j)) > 0){
                    res.add(nums[j]);
                }
            }
            ans.add(res);
        }
        return ans;
    }

