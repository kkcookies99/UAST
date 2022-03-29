class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> temp=new ArrayList<List<Integer>> ();
        List<Integer> list=new ArrayList<Integer>();
        temp.add(list);
        if(nums.length==0){
            return temp;
        }
        tt(0,nums,temp);
        return temp;
    }
    public void tt(int start,int[] nums, List<List<Integer>> temp){
        if(start==nums.length)return;
        int size=temp.size();
        for(int i=0;i<size;i++){
            List<Integer> list2=new ArrayList<Integer>(temp.get(i));
            list2.add(nums[start]);
            temp.add(list2);
        }
        tt(start+1,nums,temp);
    }
}

