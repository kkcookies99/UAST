class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> XXX(int[] nums) {
        used = new boolean[21];
        dfs(nums); //-10 <= nums[i] <= 10
        return res;
    }

    public void dfs(int[] nums){
        if (path.size()==nums.length){
            res.add(new ArrayList(path));
        }

        for(int i=0;i<nums.length; i++){
            if (used[nums[i]+10]==true) continue;
            used[nums[i]+10] = true;
            path.add(nums[i]);
            dfs(nums);
            used[nums[i]+10] = false;
            path.remove(path.size()-1);
        }

    }
}

