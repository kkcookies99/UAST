class Solution {
    List<List<Integer>> res = new ArrayList();
    int len = 0;
    public List<List<Integer>> XXX(int[] nums) {
        len = nums.length;
        res.add(new ArrayList());
        find(nums,0, new ArrayList());
        return res;
    }
    public void find(int[] nums, int index, List<Integer> tmp){
        if(index>=len){
            return;
        }
        for(int i=index;i<len;i++){
            tmp.add(nums[i]);
            res.add(new ArrayList(tmp));
            find(nums,i+1,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}

