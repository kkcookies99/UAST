 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(p);
        stack2.push(q);
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            p = stack1.pop();
            q = stack2.pop();
            //如果同时为null跳过
            if (p == null && q == null) {
                continue;
                //如果同时不为null且值相等继续检测左子树/右子树
            } else if (p != null && q != null && p.val == q.val) {
                //如果两个二叉树左右子树任一个子树有一个为null另一个不为null就返回false
                if ((p.left == null ^ q.left == null)
                        || (p.right == null ^ q.right == null)) {
                    return false;
                }
                stack1.push(p.left);
                stack2.push(q.left);
                stack1.push(p.right);
                stack2.push(q.right);
                //其余情况返回false
            } else {
                return false;
            }
        }
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

