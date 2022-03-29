 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }
        return result;
    }
}

