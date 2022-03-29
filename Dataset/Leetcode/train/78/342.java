class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList<>());
        for(int num:nums){
            int temp = res.size();
            for(int i=0;i<temp;i++){
                List<Integer> ans = new ArrayList(res.get(i));
                ans.add(num);
                res.add(ans);
            }
        }
        return res;
    }
}

