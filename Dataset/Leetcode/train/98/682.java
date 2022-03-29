 class Solution {
    public boolean XXX(TreeNode root) {
        if (root==null || (root.left==null && root.right==null)) return true;
        long cur = Long.MIN_VALUE;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while (!(s.empty())) {
            TreeNode curnode= s.peek();
            if (curnode.left!=null) {
                s.push(curnode.left);  
                curnode.left = null;
            } else {
                long val = s.pop().val;
                if (val <= cur) return false;
                cur = val;
                if (curnode.right!=null) s.push(curnode.right);
            }
        }
        return true;
    }
    
}

