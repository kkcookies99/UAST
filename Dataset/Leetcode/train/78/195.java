public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,nums,new ArrayList<>(),0);
        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, ArrayList<Integer> temp, int deep) {
        if (deep>=nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int j = 0; j < 1; j++) {
            temp.add(nums[deep]);
            dfs(res,nums,temp,deep+1);
            temp.remove(temp.size()-1);
            dfs(res,nums,temp,deep+1);
        }
    }

