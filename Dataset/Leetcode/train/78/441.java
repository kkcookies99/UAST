 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        if(nums == null || nums.length == 0) return res;
        dfs(res, new ArrayList<>(), nums, 0);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> list, int[] nums, int index){
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            dfs(res,list,nums, i+1);
            list.remove(list.size() - 1);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


