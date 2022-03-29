 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<1)
        return res;
        helper(res,new ArrayList<Integer>(),nums,0);
        return res;
    }

    public void helper(List<List<Integer>> res,List<Integer> cur,int[] nums,int index){
        if(index==nums.length){
            res.add(new ArrayList(cur));
            return ;
        }
        //将当前index加入
        cur.add(nums[index]);
        helper(res,cur,nums,index+1);
        //将当前index不加入
        cur.remove(cur.size()-1);
        helper(res,cur,nums,index+1);
    }
}

