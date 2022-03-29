class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len==0) return res;
        List<Integer> path = new ArrayList<Integer>();
        boolean[] used = new boolean[len];
        dfs(nums,0,path,used,res);
        return res;
    }

    public void dfs(int[] nums, int index, List<Integer> path, boolean[] used, List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(path));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){  // 这个数字已经选过，跳过
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            dfs(nums,index+1,path,used,res);
            path.remove(path.size()-1);
            used[i] = false;
        }

    }
}

