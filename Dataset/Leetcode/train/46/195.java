class Solution {

    List<List<Integer>> list= new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        dfs(nums,0);
        return list;
    }
    void dfs(int[] nums,int idx){
        if(path.size()==nums.length){
            list.add(new ArrayList<>(path));
        }
        if(idx<nums.length){
            for(int i=0;i<nums.length;i++){
                if(path.contains(nums[i]))continue;
                path.add(nums[i]);
                dfs(nums,idx+1);
                path.remove(path.size()-1);
            }
        }
    }
}

