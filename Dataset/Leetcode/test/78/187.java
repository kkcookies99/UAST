class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums){
        for(int i=0;i<=nums.length;i++){
            ziji(i,0,nums,new Stack<Integer>());
        }return ans;
    }
    public void ziji(int size,int kaishi,int nums[],Stack<Integer> list){
        if(list.size()==size){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=kaishi;i<nums.length;i++){
            list.push(nums[i]);
            ziji(size,kaishi+1,nums,list);
            list.pop();
        }
    }
}

