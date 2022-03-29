class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        this.backTracking(nums,0);
        return res;
    }

    public void backTracking(int[] nums,int startIndex){
        res.add(new ArrayList<>(path));
        if(startIndex>=nums.length){
            return;
        }
        for (int i=startIndex;i<nums.length;i++){
            path.add(nums[i]);
            this.backTracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}

