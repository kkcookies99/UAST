 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            int m =result.size();
            for(int j=0;j<m;j++){
                List<Integer> temp = new ArrayList<Integer>();
                for(int k=0;k<result.get(j).size();k++){
                    temp.add(result.get(j).get(k));
                }
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}

