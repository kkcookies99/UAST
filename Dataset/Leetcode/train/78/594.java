  class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> tempset=new ArrayList<Integer>();
        result.add(tempset);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<(1<<i);j++){
                tempset=new ArrayList<Integer>();
                for(Integer k : result.get(j)){
                    tempset.add(k);
                }
                tempset.add(nums[i]);
                result.add(tempset);
            }
        }
        return result;
    }
}