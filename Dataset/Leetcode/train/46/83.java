class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        XXXDFS(nums,res,new ArrayList<>());
        return res;
    }

    public void XXXDFS(int[] nums,List<List<Integer>> res,List<Integer> tmp){
        if(tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!tmp.contains(nums[i])){
                tmp.add(nums[i]);
                XXXDFS(nums,res,tmp);
                tmp.remove(tmp.size()-1);
            }            
            
        }
    }

}

