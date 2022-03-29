class Solution {
    public int nums[];
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        this.nums = nums;
        dfs(0);
        return res;
    }
    public void dfs(int x){
        if(x == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                list.add(nums[j]);
            }
            res.add(list);
        }
        
        for(int i=x;i<nums.length;i++){
            swap(x,i);
            dfs(x+1);
            swap(x,i);
        }
    }
    public void swap(int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

