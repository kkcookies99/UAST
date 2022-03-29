 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        cal(nums,-1,result);
        return result;
    }
    public void cal(int[] nums,int n,List<List<Integer>> result){
        if(n==-1){
            result.add(new ArrayList<Integer>());
        }else{
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            for(int i=0;i<result.size();i++){
                List<Integer> temp1 = copy(result.get(i));
                temp1.add(nums[n]);
                temp.add(temp1);
            }
            result.addAll(temp);
        }
        if(n<nums.length-1){
            cal(nums,n+1,result);
        }
    }
    public List<Integer> copy(List<Integer> src){
        List<Integer> dest = new ArrayList<Integer>();
        for(int i=0;i<src.size();i++){
            dest.add(src.get(i));
        }
        return dest;
    }
}

