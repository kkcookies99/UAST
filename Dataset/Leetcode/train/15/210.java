 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        if(nums.length<3){
            return new ArrayList();
        }
        List<Integer> temp=new ArrayList<>();
        dfs(nums,temp,0);
        return res;

    }
    public List<List<Integer>> res=new ArrayList<>();
    public void dfs(int [] nums,List<Integer> temp,int len){
        if(temp.size()==3&&temp.get(0)+temp.get(1)+temp.get(2)==0){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=len;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }

}

