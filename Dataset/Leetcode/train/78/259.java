class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums,0);
        return list;
    }

    private void dfs(int[] nums,int index){
        list.add(new ArrayList<>(path));
        if(index==nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

