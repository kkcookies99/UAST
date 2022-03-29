 class Solution {
    public List<Integer> XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        TreeNode cur = root;
        while(true) {
            if(cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else if (stack.size() == 0) {
                return res;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
    }
}

