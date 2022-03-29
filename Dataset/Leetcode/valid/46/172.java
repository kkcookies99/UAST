class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] bol = new boolean[nums.length];
        Stack<Integer> stack = new Stack<>();
        dfs(nums, bol, stack, res);
        return res;
    }
    public void dfs(int[] nums, boolean[] bol, Stack<Integer> stack, List<List<Integer>> res){
        if(stack.size() == nums.length){
            res.add(new ArrayList<>(stack));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!bol[i]){
                bol[i] = true;
                stack.add(nums[i]);
                dfs(nums, bol, stack, res);
                bol[i] = false;
                stack.remove(stack.size() - 1);
            }
        }
    }
}

