public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> fac = new ArrayList<>();
        dfs3(nums, ans, fac, 0);
        return ans;
    }
    private void dfs3(int[] nums, List<List<Integer>> ans, List<Integer> fac, int index){
        ans.add(new ArrayList<>(fac));
        for (int i = index; i <nums.length; i++){
            fac.add(nums[i]);
            dfs3(nums, ans, fac, i + 1);
            fac.remove(fac.size() - 1);
        }
    }

