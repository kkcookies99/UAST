 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        int[] flag = new int[nums.length];
        Arrays.fill(flag,0);
        
        DFS(res,temp,flag,nums);
        
        return res;      
    }
    
    
    public void DFS(List<List<Integer>> res,LinkedList<Integer> temp,int[] flag,int[] nums){
        
        if(temp.size() == nums.length){
            res.add(new LinkedList<Integer>(temp));
        }
        for(int i = 0; i < nums.length;i++){
            
            if(flag[i] != 0) 
                continue;
            
            temp.add(nums[i]);
            flag[i] = 1;
            DFS(res,temp,flag,nums);
            
            temp.removeLast();
            flag[i] = 0;
        }        
    }
}

