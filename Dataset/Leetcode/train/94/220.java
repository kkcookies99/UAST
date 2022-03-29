 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            node = stack.pop();
            ret.add(node.val);
            node = node.right;
        }
        return ret;
    }
}

