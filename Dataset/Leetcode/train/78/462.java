 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        List<Integer> l = new ArrayList<Integer>();
        helper(list,nums,len,l,0);
        return list;
    }
    public void helper(List<List<Integer>> list, int[] nums, int len, List<Integer> last, int cur){
        list.add(last);
        if(cur == len){
            return;
        }        
        for(int i = cur; i<len;i++){
            List<Integer> now = new ArrayList<>(last);
            now.add(nums[i]);
            helper(list,nums,len,now,i+1);
        }
    }
}

