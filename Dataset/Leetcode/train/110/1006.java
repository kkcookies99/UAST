 class Solution {
    public boolean XXX(TreeNode root) {
        if(root ==null ) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(Math.abs(maxDepth(node.left)-maxDepth(node.right))>1) {
                return false;
            }
            if(node.right!=null) {
                stack.push(node.right);
            }
            if(node.left!=null) {
                stack.push(node.left);
            }
        }
        return true;
    }
    
    public int maxDepth(TreeNode root) {
        if(root ==null) {
            return 0;
        }
        int left =maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right)+1;
    }
    
}

