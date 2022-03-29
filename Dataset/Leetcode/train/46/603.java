 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackV2(res, nums, new ArrayList<>(), new boolean[nums.length + 1]);
        return res;
    }
    public void backtrackV2(List<List<Integer>> res,int[] nums,List<Integer> temp ,boolean[] visit){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visit[i]){
                continue;
            }
            temp.add(nums[i]);
            visit[i] = true;
            backtrackV2(res, nums,temp,visit);
            temp.remove(temp.size() - 1);
            visit[i] = false;
        }
    }

