 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        pushStack(root,stack);
        while(!stack.empty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right != null) pushStack(temp.right,stack);
        }
        return list;
    }
    public void pushStack(TreeNode root, Stack<TreeNode> stack){
        while(root!= null){
            stack.push(root);
            root = root.left;
        }
    }
}

