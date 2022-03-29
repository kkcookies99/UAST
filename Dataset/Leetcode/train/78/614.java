 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int end = (int)Math.pow(2,nums.length);
        for(int i = 0;i<end;i++)
            ans.add(helper(nums,i));
        return ans;
    }
    //把n化为二进制，0表示不取，1表示取
    public List<Integer> helper(int[] nums,int n){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(n!=0){
            if((n&1)==1)
                ans.add(nums[i]);
            i++;
            n >>= 1;
        }
        return ans;
    }
}

