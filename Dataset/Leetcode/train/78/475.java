 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0;i<=nums.length;i++){
            recursion(0,nums.length,0,i,new ArrayList<Integer>(),lists,nums);
        }
        return lists;
    }
    
    public void recursion(int start,int n,int j, int k, List<Integer> list,List<List<Integer>> lists,int nums[]){
        if(j == k){
            lists.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = start;i<n;i++){
            list.add(nums[i]);
            recursion(i+1,n,j+1,k,list,lists,nums);
            list.remove(list.size()-1);
        }
    }
}

