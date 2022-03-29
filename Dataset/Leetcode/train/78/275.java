class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        res.add(new ArrayList<>());
        backtracking(nums,0,new ArrayList<>());
        return res;
    }

    public void backtracking(int[] nums, int startIndex, ArrayList<Integer> set){
        if(startIndex == nums.length){
            return;
        }

        for(int i = startIndex ; i < nums.length ; i++){
            set.add(nums[i]);
            ArrayList<Integer> tmp = new ArrayList<>(set);
            res.add(tmp);
            backtracking(nums,i+1,set);
            set.remove(set.size() - 1);
        }
    }
}

