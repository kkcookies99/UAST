 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> rel = new ArrayList<>();
        rel.add(new ArrayList<Integer>());
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> temp = new ArrayList<>();
            for(List<Integer> l : rel){
                List<Integer> t = new ArrayList<>();
                for(Integer n : l){
                    t.add(n);
                }
                t.add(nums[i]);
                temp.add(t);
            }
            for(List<Integer> t : temp){
                rel.add(t);
            }
        }
        return rel;
    }
}

