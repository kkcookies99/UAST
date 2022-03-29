 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        dfs(list, nums, res);
        return list;

    }

    private void dfs(List<List<Integer>> list, int[] nums, List<Integer> res){
        if(res.size() == nums.length){
            list.add(new ArrayList<>(res));
            return ;
        }
        for(int num : nums){
            if(!res.contains(num)) {
                res.add(num);
                dfs(list, nums, res);
                res.remove(res.size() - 1);
            }
        }
    }

