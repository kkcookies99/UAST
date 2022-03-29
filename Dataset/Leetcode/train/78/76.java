class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,result,0,new ArrayList<>());
        return result;
    }
    public void backtrack(int[] nums,List<List<Integer>> result,int i,List<Integer> l){
        if(i>nums.length){return ;}
        if(!result.contains(l)){
            result.add(new ArrayList<>(l));
        }
        for(int start=i;start<nums.length;start++){
            l.add(nums[start]);
            backtrack(nums,result,start+1,l);
            l.remove(l.size()-1);
        }
    }
}

