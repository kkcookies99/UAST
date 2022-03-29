class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        result.add(new ArrayList<Integer>());
        backtrace(new ArrayList<Integer>(),nums,0);
        return result;
    }

    public void backtrace(List<Integer> list,int[] nums,int index){
        if(index==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            List<Integer> cur=new ArrayList<>();
            for(int num:list){
                cur.add(num);
            }
            cur.add(nums[i]);
            result.add(cur);
            backtrace(cur,nums,i+1);
        }
    }
}

