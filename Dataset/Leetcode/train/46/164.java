class Solution {
    List<List<Integer>> ans;
    List<Integer> temp;
    public List<List<Integer>> XXX(int[] nums) {
        ans = new ArrayList<>();
        temp = new ArrayList<>();
        int[] v = new int[nums.length];
        map(nums,v,0);
        return ans;
    }
    private void map(int[] nums,int[] v,int index){
        if(index == nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(v[i] == 0){
                v[i] = 1;
                temp.add(nums[i]);
                map(nums,v,index + 1);
                temp.remove(temp.size() - 1);
                v[i] = 0;
            }
        }
    }
}
