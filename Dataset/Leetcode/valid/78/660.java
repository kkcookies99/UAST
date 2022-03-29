 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> results=new ArrayList<>();
     List<Integer> result=new ArrayList<>();
    results.add(result);
        for(int i=0;i<nums.length;i++){
            int cur_len=results.size();
            for(int j=0;j<cur_len;j++){
                List<Integer> result_new=new ArrayList<>(results.get(j));
                result_new.add(nums[i]);
                results.add(result_new);
            }
        }
        return results;
    }
}

