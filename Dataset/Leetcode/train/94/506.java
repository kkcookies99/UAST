 class Solution {
    public List<Integer> XXX(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()) {
            while(p != null) {
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()) {
                p = stack.pop();
                res.add(p.val);
                p = p.right;
            }
        }
        return res;
    }
}

