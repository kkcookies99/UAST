class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums){
        for(int i=0;i<=nums.length;i++){
            ziji(i,0,nums,new ArrayList<Integer>());
        }return ans;
    }
    public void ziji(int size,int kaishi,int nums[],ArrayList<Integer> list){
        if(list.size()==size){
            ans.add(list);
            return;
        }
        for(int i=kaishi;i<nums.length;i++){
            list.add(nums[i]);
            ziji(size,kaishi+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}

