 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q != null) {
            return false;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode cur1 = p;
        TreeNode cur2 = q;
        while (cur1 != null || !stack1.isEmpty()) {
            if (cur1 != null) {
                if (cur2 == null || cur1.val != cur2.val) {
                    return false;
                }
                stack1.push(cur1);
                cur1 = cur1.left;
                stack2.push(cur2);
                cur2 = cur2.left;
            } else {
                if (cur2 != null) {
                    return false;
                }
                cur1 = stack1.pop();
                cur1 = cur1.right;
                cur2 = stack2.pop();
                cur2 = cur2.right;
            }
        }
        return true;
    }
}

