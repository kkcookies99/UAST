 class Solution {
    public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while(root != null || !stack.isEmpty()){
            
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null){
                root = node.right;
            }
        }
        return res;
    }
}

