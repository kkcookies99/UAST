class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        XXX(nums,result,sub,0);
        return result;
    }
    void XXX(int[] nums,List<List<Integer>> result,List<Integer> sub,int step){
        result.add(sub);
        for(int i=step;i<nums.length;i++){
            List<Integer> sub1=new ArrayList<>(sub);
            sub1.add(nums[i]);
            XXX(nums,result,sub1,i+1);
        }
    }
}

