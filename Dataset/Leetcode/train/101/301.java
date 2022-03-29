 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(root.left==null&&root.right==null) return true;
        if(root.right == null) return false;
        if(root.left == null) return false;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode p1 ;
        TreeNode p2 ;
        stack1.push(root.right);
        stack2.push(root.left);
        while (!stack1.isEmpty()&&!stack2.isEmpty())
        {
            p1 = stack1.pop();
            p2 = stack2.pop();
            if (p2!=null&&p1!=null&&(p1.val==p2.val))
            {
                if (p1.left!=null&&p2.right!=null)
                {
                    stack1.push(p1.left);
                    stack2.push(p2.right);
                }
                else if (p1.left==null&&p2.right==null)
                {

                }
                else {
                    return false;
                }
                if (p1.right!=null&&p2.left!=null)
                {
                    stack1.push(p1.right);
                    stack2.push(p2.left);
                }
                else if (p1.right==null&&p2.left==null)
                {

                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}

