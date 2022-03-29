class Solution {
    public List<List<Integer>> XXX(int[] nums) {

        List<List<Integer>> rs = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        rs.add(new ArrayList<>());
        dfs(nums,stack,rs);
        return rs;
    }

    void dfs(int[] nums,Stack<Integer> stack , List<List<Integer>> rs){
        if(nums == null || nums.length == 0){
            return ;
        }
        if(nums.length == 1){
            stack.push(nums[0]);
            rs.add(toList(stack));
            stack.pop();
            return;
        }

        for(int i =0;i<nums.length;i++){
            int toPush = nums[i];
            stack.push(toPush);
            rs.add(toList(stack));
            dfs(copy(nums,i),stack,rs);
            stack.pop();
        }
    }

    List<Integer> toList(Stack<Integer> stack){
        List<Integer> list = new ArrayList<>();
        for(int c: stack){
            list.add(c);
        }
        return list;
    }

    int[] copy(int[] nums , int j){
        if(j == nums.length-1){
            return null;
        }
        int[] cp = new int[nums.length -j-1];
        int k = 0;
        for(int i =j+1;i<nums.length;i++){
            if(i !=j){
                cp[k++] = nums[i];
            }
        }
        return cp;
    }
}

