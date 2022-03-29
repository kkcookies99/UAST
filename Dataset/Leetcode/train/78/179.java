class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        Stack<Integer> path=new Stack<>();
        backtrack(nums,0,nums.length,path);
        return res;
    }
    public void backtrack(int[] nums,int index,int n,Stack<Integer> path){
        if(index==n){
            res.add(new ArrayList<>(path));
            return;
        }
        backtrack(nums,index+1,n,path);
        path.add(nums[index]);
        backtrack(nums,index+1,n,path);
        path.pop();
    }
}

