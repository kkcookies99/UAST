class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(len == 0) return l;
        List<Integer> ll = new ArrayList<Integer>();
        dfs(nums,l,ll);
        return l;
    }
    public void dfs(int[] nums,List<List<Integer>> l,List<Integer> ll){
        if(ll.size() == nums.length){
            l.add(new ArrayList<Integer>(ll));
        }
        for(int i=0;i<nums.length;i++){
            if(ll.contains(nums[i]))  continue;
            ll.add(nums[i]);
            dfs(nums,l,ll);
            ll.remove(ll.size()-1);          
        }
    }
}

