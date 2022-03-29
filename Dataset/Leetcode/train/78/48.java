class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list_ = new ArrayList<>();
        backtrack(list_,new ArrayList<Integer>(),0,nums);
        return list_;
    }
    private void backtrack(List<List<Integer>> list_, List<Integer> list,int j, int[] nums){
        list_.add(new ArrayList<>(list));
        for(int i=j; i<nums.length; i++){
            list.add(nums[i]);
            backtrack(list_,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}

