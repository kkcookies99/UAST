class Solution {
    private List<List<Integer>> result; 
    private int[] nums;

    public List<List<Integer>> XXX(int[] nums){
        this.nums=nums;
        result=new LinkedList<>();
        backtrack(new LinkedList<Integer>(),0);
        return result;
    }
    private void backtrack(LinkedList<Integer> track,int first){
        //将track加入result中
        result.add(new LinkedList<Integer>(track));

        //base case
        if(first>=nums.length){
            return;
        }

        for(int i=first;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(track,i+1);
            track.removeLast();
        }
        return;

    } 
       
    
}

