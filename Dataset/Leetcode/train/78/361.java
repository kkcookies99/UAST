class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int sum = (int)Math.pow(2,nums.length);
        for(int i = 0;i < sum; i++){
            List<Integer> list = new ArrayList();
            for(int j = 0; j < nums.length;j++){
                if((i&(1<<j)) != 0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}

