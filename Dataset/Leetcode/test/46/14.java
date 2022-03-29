class Solution {
    public List<Integer> path = new ArrayList<>();
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {
        this.backTracking(nums);
        return res;
    }

    public void backTracking(int[] nums){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i =0;i<nums.length;i++){
            if(!path.contains(nums[i])){
                path.add(nums[i]);
                this.backTracking(nums);
                path.remove(path.size()-1);
            }
        }

    }
}

