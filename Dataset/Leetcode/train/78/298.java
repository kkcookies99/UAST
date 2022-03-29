class Solution {
    List<List<Integer>> listlist = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        int i = 0;
        dfs(nums, len, i);
        List<Integer> nullList = new ArrayList<Integer>();
        listlist.add(new ArrayList(nullList));
        return listlist;
    }
    public void dfs(int[] nums, int len, int i){
        if(i >= len){
            return ;
        }
        //先忽略
        dfs(nums, len, i + 1);
        //加入当前
        list.add(nums[i]);
        listlist.add(new ArrayList(list));
        dfs(nums, len, i + 1);
        list.remove(list.size() - 1);
    }
}

