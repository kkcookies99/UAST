class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        backTracking(nums,0);
        return res;
    }
    void backTracking(int[] nums,int startIndex){
        res.add(new ArrayList<>(path));
        for(int i=startIndex;i<nums.length;i++){
            if(i>startIndex&&nums[i]==nums[i-1])continue;
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

