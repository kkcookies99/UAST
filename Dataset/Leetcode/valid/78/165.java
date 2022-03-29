class Solution {
    List<List<Integer>> ans;
    int length;
    int[] Nums;
    public List<List<Integer>> XXX(int[] nums) {
        length = nums.length;
        Nums = nums;
        ans = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<>();
        Count(0,l);
        return ans;
    }
    public void Count(int x, List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=x;i<length;i++){
            list.add(Nums[i]);
            Count(i+1,list);
            list.remove(list.size()-1);
        }
    }
}

