 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] trace = new boolean[nums.length];
        dp(list,new ArrayList<>(),nums,trace,0);
        return list;
    }

    private void dp(List<List<Integer>> list,List<Integer> tmp,int[] nums,boolean[] trace,int count){
        if(count == nums.length){
            list.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(trace[i] != true){
                trace[i] = true;
                tmp.add(nums[i]);
                dp(list,tmp,nums,trace,count+1);
                tmp.remove(tmp.size() -1);
                trace[i] = false;
            }
        }
    }
}

