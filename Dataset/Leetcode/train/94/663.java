 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root==null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!(stack.empty())) {
            TreeNode cur = stack.peek();
            //先查左边，如果左边没法访问过，继续添加左边
            if (cur.left!=null) {
                stack.push(cur.left);
                cur.left = null;
                continue;
            }
            //左边已经访问过，访问该节点
            res.add(stack.pop().val);
            //最后添加右侧节点
            if (cur.right!=null) stack.push(cur.right);
        }
        return res;
    }
    
}

