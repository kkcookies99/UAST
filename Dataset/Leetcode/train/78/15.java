class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<1<<n; i++){
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0; j<n; j++){
                if((i>>(n-1-j)&1)==1){
                    tmp.add(nums[j]);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}

