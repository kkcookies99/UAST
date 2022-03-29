 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList());
        for(int i=0;i<nums.length;i++){
           int l=result.size();
            for(int j=0;j<l;j++){
                List temp = new ArrayList(result.get(j));
                temp.add(nums[i]);
                result.add(new ArrayList<>(temp));
            }
        }
        return result;
    }
}

