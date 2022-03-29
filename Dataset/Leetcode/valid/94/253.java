 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}

