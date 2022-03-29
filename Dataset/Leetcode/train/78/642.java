 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        int Max = (int)Math.pow(2,len);
        for(int i=0;i<Max;i++){
            int pre = 0;
            int number = i;
            List<Integer> temp = new ArrayList<>();
            while(number != 0){
                if((number&1) == 1){
                    temp.add(nums[pre]);
                }
                number>>=1;
                pre++;
            }
            ans.add(temp);
        }
        return ans;
    }
}

