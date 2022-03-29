 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //root不是null或者栈没空都说明没遍历完
        while(root!=null || !stack.isEmpty()){
           if(root!=null){
              stack.push(root);
               root = root.left;
           }else{
               root = stack.pop();
               res.add(root.val);
               root = root.right;
           }
        }
        return res;
    }
}

