class Solution {
   public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        XXXDFS(nums,res,new ArrayList<>(),0);
        return res;
    }

    public void XXXDFS(int[] nums,List<List<Integer>> res,List<Integer> now,int index){
        res.add(new ArrayList<>(now));
        for (int i = index;i<nums.length;i++){
            now.add(nums[i]);
            XXXDFS(nums,res,now,i+1);
            now.remove(now.size()-1);
        }
    }
}

