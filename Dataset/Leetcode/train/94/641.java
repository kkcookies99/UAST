 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res=new LinkedList();
        if(root==null){
         return res;
        }
        Stack<TreeNode> stack=new Stack();
        stack.push(root);
      while(!stack.isEmpty()){
        while(root.left!=null){
            stack.push(root.left);
            root=root.left;
        }
        TreeNode root1=stack.pop();
        res.add(root1.val);
        if(root1.right!=null){
            stack.push(root1.right);
            root=root1.right;
        }
        }
        return res;
    }
}

