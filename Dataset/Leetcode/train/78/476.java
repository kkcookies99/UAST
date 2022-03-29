 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<Math.pow(2,len);i++){
            ArrayList<Integer> res = new ArrayList<>();
            int n=i;
            for(int j=0;j<len;j++){
                if(n%2==1)  res.add(nums[len-1-j]);
                n/=2;
            }
            result.add(res);
        }
        return result;
    }
}

