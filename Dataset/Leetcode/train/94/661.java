 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if(root != null) stack.addLast(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.removeLast();
            if(node != null){
                if(node.right!=null) stack.addLast(node.right);
                stack.addLast(node);
                stack.addLast(null);
                if(node.left!=null) stack.addLast(node.left);
            }else{
                res.add(stack.removeLast().val);
            }
        }
        return res;
    }
}

