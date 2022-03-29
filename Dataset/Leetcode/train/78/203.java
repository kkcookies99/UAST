class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        
        for(int i = 0; i < Math.pow(2,nums.length); i++){
            List<Integer> in = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if((i >> j) %2 == 1){
                    in.add(nums[j]);
                }
            }
            out.add(in);
        }
        return out;
    }
}

